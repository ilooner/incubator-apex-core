package org.apache.apex.malhar.lib.state.spillable;

import javax.validation.constraints.NotNull;

import org.apache.apex.malhar.lib.utils.serde.Serde;

import com.google.common.base.Preconditions;

import com.datatorrent.api.Context;

public class SpillableComplexComponentImpl implements SpillableComplexComponent
{
  @NotNull
  private SpillableStateStore spillableStateStore;
  @NotNull
  private SpillableIdentifierGenerator identifierGenerator;

  private SpillableComplexComponentImpl()
  {
    //for kryo
  }

  public SpillableComplexComponentImpl(@NotNull SpillableStateStore spillableStateStore,
      @NotNull SpillableIdentifierGenerator identifierGenerator)
  {
    this.spillableStateStore = Preconditions.checkNotNull(spillableStateStore);
    this.identifierGenerator = Preconditions.checkNotNull(identifierGenerator);
  }

  @Override
  public <T> SpillableArrayList<T> newSpillableArrayList(long bucket, Serde<T, byte[]> serde)
  {
    byte[] identifier = identifierGenerator.next();
    return new SpillableArrayListImpl<>()
  }

  @Override
  public <T> SpillableArrayList<T> newSpillableArrayList(byte[] identifier, long bucket,
      Serde<T, byte[]> serde)
  {
    return null;
  }

  @Override
  public <K, V> SpillableByteMap<K, V> newSpillableByteMap(long bucket, Serde<K, byte[]> serdeKey,
      Serde<V, byte[]> serdeValue)
  {
    byte[] identifier = identifierGenerator.next();
    return null;
  }

  @Override
  public <K, V> SpillableByteMap<K, V> newSpillableByteMap(byte[] identifier, long bucket,
      Serde<K, byte[]> serdeKey, Serde<V, byte[]> serdeValue)
  {
    return null;
  }

  @Override
  public <K, V> SpillableByteArrayListMultimap<K, V> newSpillableByteArrayListMultimap(long bucket,
      Serde<K, byte[]> serdeKey, Serde<V, byte[]> serdeValue)
  {
    byte[] identifier = identifierGenerator.next();
    return null;
  }

  @Override
  public <K, V> SpillableByteArrayListMultimap<K, V> newSpillableByteArrayListMultimap(byte[] identifier,
      long bucket, Serde<K, byte[]> serdeKey, Serde<V, byte[]> serdeValue)
  {
    return null;
  }

  @Override
  public <T> SpillableQueue<T> newSpillableQueue(long bucket, Serde<T, byte[]> serde)
  {
    byte[] identifier = identifierGenerator.next();
    return null;
  }

  @Override
  public <T> SpillableQueue<T> newSpillableQueue(byte[] identifier, long bucket, Serde<T, byte[]> serde)
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
