package ru.sber.collections.collections1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class LinkedListIterator<E> implements Iterator<E> {

    private java.util.LinkedList<E> linkedList;
    private int i;

    public LinkedListIterator(LinkedList<E> linkedList) {
        this.linkedList = linkedList;
        this.i = 0;
    }

    @Override
    public boolean hasNext() {
        return i < linkedList.size();
    }

    @Override
    public E next() throws NoSuchElementException {
        if (hasNext()) {
            i++;
            return linkedList.get(i-1);
        }
        else {
            throw new NoSuchElementException("В полносвязном списке нет элементов");
        }
    }
}
