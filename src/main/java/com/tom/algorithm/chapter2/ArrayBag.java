package com.tom.algorithm.chapter2;

/**
 * A class of bags whose entries are sorted in a fixed-size
 *
 * @author Tom on 2020/12/6
 */
public final class ArrayBag<T> implements BagInterface<T> {

    @Override
    public boolean add(T newEntry) {
        return false;
    }

    @Override
    public T[] toArray() {
        return null;
    }

    @Override
    public boolean isArrayFull() {
        return false;
    }
}
