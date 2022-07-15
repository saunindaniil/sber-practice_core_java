package ru.sber.collections.collections1;

public interface Collection<E> extends Iterable<E> {
    int size();
    boolean isEmpty();
    boolean contains(E item);
    boolean add(E item);
    boolean remove(E item);
    void clear();
}
