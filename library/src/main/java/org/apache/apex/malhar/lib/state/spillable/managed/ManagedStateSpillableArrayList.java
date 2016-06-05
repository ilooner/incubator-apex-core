package org.apache.apex.malhar.lib.state.spillable.managed;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.validation.constraints.NotNull;

import org.apache.apex.malhar.lib.state.managed.ManagedStateImpl;
import org.apache.apex.malhar.lib.state.spillable.Spillable;

import com.google.common.base.Preconditions;

import com.datatorrent.lib.appdata.gpo.GPOUtils;

public class ManagedStateSpillableArrayList<T> implements Spillable.SpillableArrayList<T>
{
  public static final int DEFAULT_BATCH_SIZE = 1000;
  public static final long SIZE_INDEX = 0L;

  private int batchSize = DEFAULT_BATCH_SIZE;
  private long bucketId;
  private byte[] prefix;
  @NotNull
  private ManagedStateImpl managedState;

  private boolean sizeCached = false;
  private int size;

  private ManagedStateSpillableArrayList()
  {
    //for kryo
  }

  public ManagedStateSpillableArrayList(long bucketId, @NotNull byte[] prefix, @NotNull ManagedStateImpl managedState)
  {
    this.bucketId = bucketId;
    this.prefix = Preconditions.checkNotNull(prefix);
    this.managedState = Preconditions.checkNotNull(managedState);
  }

  public ManagedStateSpillableArrayList(long bucketId, @NotNull byte[] prefix, @NotNull ManagedStateImpl managedState,
      int batchSize)
  {
    this(bucketId, prefix, managedState);
    Preconditions.checkArgument(this.batchSize > 0);
    this.batchSize = batchSize;
  }

  @Override
  public int size()
  {
    if (sizeCached) {
      return size;
    }

    GPOUtils.serializeLong()
    return 0;
  }

  @Override
  public boolean isEmpty()
  {
    return false;
  }

  @Override
  public boolean contains(Object o)
  {
    return false;
  }

  @Override
  public Iterator<T> iterator()
  {
    return null;
  }

  @Override
  public Object[] toArray()
  {
    return new Object[0];
  }

  @Override
  public <T1> T1[] toArray(T1[] t1s)
  {
    return null;
  }

  @Override
  public boolean add(T t)
  {
    return false;
  }

  @Override
  public boolean remove(Object o)
  {
    return false;
  }

  @Override
  public boolean containsAll(Collection<?> collection)
  {
    return false;
  }

  @Override
  public boolean addAll(Collection<? extends T> collection)
  {
    return false;
  }

  @Override
  public boolean addAll(int i, Collection<? extends T> collection)
  {
    return false;
  }

  @Override
  public boolean removeAll(Collection<?> collection)
  {
    return false;
  }

  @Override
  public boolean retainAll(Collection<?> collection)
  {
    return false;
  }

  @Override
  public void clear()
  {

  }

  @Override
  public T get(int i)
  {
    return null;
  }

  @Override
  public T set(int i, T t)
  {
    return null;
  }

  @Override
  public void add(int i, T t)
  {

  }

  @Override
  public T remove(int i)
  {
    return null;
  }

  @Override
  public int indexOf(Object o)
  {
    return 0;
  }

  @Override
  public int lastIndexOf(Object o)
  {
    return 0;
  }

  @Override
  public ListIterator<T> listIterator()
  {
    throw new UnsupportedOperationException();
  }

  @Override
  public ListIterator<T> listIterator(int i)
  {
    throw new UnsupportedOperationException();
  }

  @Override
  public List<T> subList(int i, int i1)
  {
    throw new UnsupportedOperationException();
  }
}
