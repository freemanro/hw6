package com.maktab74.hw6.util;

public interface LinkedList<E> {
    void add(int index, E element) throws InvalidIndexException;

    void add(E element);

    E remove(int index) throws InvalidIndexException;

    boolean remove(E element);

    int indexOf(E element);

    int size();

    boolean isEmpty();
}
