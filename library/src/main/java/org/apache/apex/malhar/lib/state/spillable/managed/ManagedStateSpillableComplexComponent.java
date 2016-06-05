package org.apache.apex.malhar.lib.state.spillable.managed;

import javax.validation.constraints.NotNull;

import org.apache.apex.malhar.lib.state.managed.ManagedStateImpl;
import org.apache.apex.malhar.lib.state.spillable.SpillableComplexComponent;
import org.apache.apex.malhar.lib.utils.serde.Serde;

import com.datatorrent.api.Context;

public class ManagedStateSpillableComplexComponent implements SpillableComplexComponent
{
  @NotNull
  private ManagedStateImpl managedState;

  private ManagedStateSpillableComplexComponent()
  {
    //for kryo
  }

  public ManagedStateSpillableComplexComponent(@NotNull ManagedStateImpl managedState)
  {
    this.managedState = managedState;
  }

  @Override
  public <T> SpillableArrayList<T> newSpillableArrayList(long bucket, Serde<T, byte[]> serde)
  {
    return null;
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
    throw new UnsupportedOperationException();
  }

  @Override
  public <K, V> SpillableByteMap<K, V> newSpillableByteMap(byte[] identifier, long bucket,
      Serde<K, byte[]> serdeKey, Serde<V, byte[]> serdeValue)
  {
    throw new UnsupportedOperationException();
  }

  @Override
  public <K, V> SpillableByteArrayListMultimap<K, V> newSpillableByteArrayListMultimap(long bucket,
      Serde<K, byte[]> serdeKey, Serde<V, byte[]> serdeValue)
  {
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
    throw new UnsupportedOperationException();
  }

  @Override
  public <T> SpillableQueue<T> newSpillableQueue(byte[] identifier, long bucket, Serde<T, byte[]> serde)
  {
    throw new UnsupportedOperationException();
  }

  @Override
  public void beginWindow(long windowId)
  {
    managedState.
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
