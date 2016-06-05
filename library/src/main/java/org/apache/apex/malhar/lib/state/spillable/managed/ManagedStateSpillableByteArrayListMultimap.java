package org.apache.apex.malhar.lib.state.spillable.managed;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import org.apache.apex.malhar.lib.state.managed.ManagedState;
import org.apache.apex.malhar.lib.state.managed.ManagedStateImpl;
import org.apache.apex.malhar.lib.state.spillable.Spillable;

import com.google.common.base.Preconditions;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multiset;

import com.datatorrent.api.Context;

public class ManagedStateSpillableByteArrayListMultimap<K, V> implements Spillable.SpillableByteArrayListMultimap<K, V>,
    Spillable.SpillableComponent
{
  @NotNull
  private ManagedStateImpl managedState;

  private ManagedStateSpillableByteArrayListMultimap()
  {
    //for kryo
  }

  public ManagedStateSpillableByteArrayListMultimap(@NotNull ManagedStateImpl managedState)
  {
    this.managedState = Preconditions.checkNotNull(managedState);
  }

  @Override
  public List<V> get(@Nullable K key)
  {
    return null;
  }

  @Override
  public Set<K> keySet()
  {
    return null;
  }

  @Override
  public Multiset<K> keys()
  {
    return null;
  }

  @Override
  public Collection<V> values()
  {
    return null;
  }

  @Override
  public Collection<Map.Entry<K, V>> entries()
  {
    return null;
  }

  @Override
  public List<V> removeAll(@Nullable Object key)
  {
    return null;
  }

  @Override
  public void clear()
  {

  }

  @Override
  public int size()
  {
    return 0;
  }

  @Override
  public boolean isEmpty()
  {
    return false;
  }

  @Override
  public boolean containsKey(@Nullable Object key)
  {
    return false;
  }

  @Override
  public boolean containsValue(@Nullable Object value)
  {
    return false;
  }

  @Override
  public boolean containsEntry(@Nullable Object key, @Nullable Object value)
  {
    return false;
  }

  @Override
  public boolean put(@Nullable K key, @Nullable V value)
  {
    return false;
  }

  @Override
  public boolean remove(@Nullable Object key, @Nullable Object value)
  {
    return false;
  }

  @Override
  public boolean putAll(@Nullable K key, Iterable<? extends V> values)
  {
    return false;
  }

  @Override
  public boolean putAll(Multimap<? extends K, ? extends V> multimap)
  {
    return false;
  }

  @Override
  public List<V> replaceValues(K key, Iterable<? extends V> values)
  {
    return null;
  }

  @Override
  public Map<K, Collection<V>> asMap()
  {
    return null;
  }

  @Override
  public void beginWindow(long windowId)
  {

  }

  @Override
  public void endWindow()
  {

  }

  @Override
  public void setup(Context.OperatorContext context)
  {

  }

  @Override
  public void teardown()
  {

  }
}
