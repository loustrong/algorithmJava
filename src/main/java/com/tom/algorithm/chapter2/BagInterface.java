package com.tom.algorithm.chapter2;

/**
 * Bag Interface
 *
 * @author Tom on 2020/12/6
 */
public interface BagInterface<T> {
    public boolean add(T newEntry);
    public T[] toArray();
    public boolean isArrayFull();

}
