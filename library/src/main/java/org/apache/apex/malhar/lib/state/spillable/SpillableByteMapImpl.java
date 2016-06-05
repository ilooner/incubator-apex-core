package org.apache.apex.malhar.lib.state.spillable;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import javax.validation.constraints.NotNull;

import org.apache.apex.malhar.lib.state.BucketedState;
import org.apache.apex.malhar.lib.utils.serde.Serde;
import org.apache.apex.malhar.lib.utils.serde.SliceUtils;
import org.apache.commons.lang3.mutable.MutableInt;

import com.google.common.base.Preconditions;

import com.datatorrent.api.Context;
import com.datatorrent.netlet.util.Slice;

public class SpillableByteMapImpl<K, V> implements Spillable.SpillableByteMap<K, V>, Spillable.SpillableComponent
{
  @NotNull
  private SpillableStateStore store;
  @NotNull
  private byte[] identifier;
  private long bucket;
  @NotNull
  private Serde<K, byte[]> serdeKey;
  @NotNull
  private Serde<V, byte[]> serdeValue;

  private int size = 0;

  private transient WindowBoundedMapCache<K, V> cache = new WindowBoundedMapCache<>();
  private transient MutableInt tempOffset = new MutableInt();

  private SpillableByteMapImpl()
  {
    //for kryo
  }

  public SpillableByteMapImpl(SpillableStateStore store, byte[] identifier, long bucket, Serde<K, byte[]> serdeKey,
      Serde<V, byte[]> serdeValue)
  {
    this.store = Preconditions.checkNotNull(store);
    this.identifier = Preconditions.checkNotNull(identifier);
    this.bucket = bucket;
    this.serdeKey = Preconditions.checkNotNull(serdeKey);
    this.serdeValue = Preconditions.checkNotNull(serdeValue);
  }

  @Override
  public int size()
  {
    return size;
  }

  @Override
  public boolean isEmpty()
  {
    return size == 0;
  }

  @Override
  public boolean containsKey(Object o)
  {
    return get(o) != null;
  }

  @Override
  public boolean containsValue(Object o)
  {
    throw new UnsupportedOperationException();
  }

  @Override
  public V get(Object o)
  {
    K key = (K)o;

    V val = cache.get(key);

    if (val != null) {
      return val;
    }

    Slice valSlice = store.getSync(bucket, new Slice(SliceUtils.concatenate(identifier, serdeKey.serialize(key))));

    if (valSlice == null || valSlice == BucketedState.EXPIRED || valSlice.length == 0) {
      return null;
    }

    tempOffset.setValue(valSlice.offset);
    return serdeValue.deserialize(valSlice.buffer, tempOffset);
  }

  @Override
  public V put(K k, V v)
  {
    cache.put(k, v);

    //This violates map contract.
    return null;
  }

  @Override
  public V remove(Object o)
  {
    cache.remove((K)o);

    //This violates map contract
    return null;
  }

  @Override
  public void putAll(Map<? extends K, ? extends V> map)
  {
    for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
      put(entry.getKey(), entry.getValue());
    }
  }

  @Override
  public void clear()
  {
    throw new UnsupportedOperationException();
  }

  @Override
  public Set<K> keySet()
  {
    throw new UnsupportedOperationException();
  }

  @Override
  public Collection<V> values()
  {
    throw new UnsupportedOperationException();
  }

  @Override
  public Set<Entry<K, V>> entrySet()
  {
    throw new UnsupportedOperationException();
  }

  @Override
  public void setup(Context.OperatorContext context)
  {
  }

  @Override
  public void beginWindow(long windowId)
  {
    cache.beginWindow(windowId);
  }

  @Override
  public void endWindow()
  {
    cache.getChangedKeys()

    cache.getRemovedKeys()

    cache.endWindow();
  }

  @Override
  public void teardown()
  {
  }

  private void putToStore(K key, V value)
  {
  }

  private void removeFromStore(K key)
  {
  }
}
