package com.maktab74.hw6.util;

public class MyLinkedList<E> implements LinkedList<E> {

    private int size;
    private Node<E> head;
    private Node<E> tail;

    public MyLinkedList() {
        head = new Node<>();
        tail = new Node<>();
        head.setNext(tail);
        tail.setPrevious(head);
    }

    @Override
    public void add(int index, E element) throws InvalidIndexException {
        if (index < 0 || index > size)
            throw new InvalidIndexException(index);

        if (index == size) {
            add(element);
            return;
        }

        Node<E> newNode = new Node<>(element);
        Node<E> currentNode = head;
        for (int i = 0; i < index; i++)
            currentNode = currentNode.getNext();

        newNode.setPrevious(currentNode);
        newNode.setNext(currentNode.getNext());
        currentNode.getNext().setPrevious(newNode);
        currentNode.setNext(newNode);

        size++;
    }

    @Override
    public void add(E element) {
        Node<E> newNode = new Node<>(element);
        newNode.setNext(tail);
        newNode.setPrevious(tail.getPrevious());
        tail.getPrevious().setNext(newNode);
        tail.setPrevious(newNode);

        size++;
    }

    @Override
    public E remove(int index) throws InvalidIndexException {
        if (index < 0 || index >= size)
            throw new InvalidIndexException(index);

        Node<E> currentNode = head;
        for (int i = 0; i <= index; i++)
            currentNode = currentNode.getNext();

        currentNode.getNext().setPrevious(currentNode.getPrevious());
        currentNode.getPrevious().setNext(currentNode.getNext());

        size--;
        return currentNode.getElement();
    }

    @Override
    public boolean remove(E element) {
        Node<E> currentNode = head;
        currentNode = currentNode.getNext();
        while (currentNode != tail) {
            if (currentNode.getElement() == null ?
                    element == null : currentNode.getElement().equals(element))
                break;
            currentNode = currentNode.getNext();
        }

        if (currentNode == tail)
            return false;

        currentNode.getNext().setPrevious(currentNode.getPrevious());
        currentNode.getPrevious().setNext(currentNode.getNext());
        size--;

        return true;
    }

    @Override
    public int indexOf(E element) {
        Node<E> currentNode = head;
        currentNode = currentNode.getNext();
        int index = 0;
        while (currentNode != tail) {
            if (currentNode.getElement() == null ?
                    element == null : currentNode.getElement().equals(element))
                break;
            currentNode = currentNode.getNext();
            index++;
        }

        if (currentNode == tail)
            return -1;

        return index;
    }

    public E get(int index) throws InvalidIndexException {
        if (index < 0 || index >= size)
            throw new InvalidIndexException(index);

        Node<E> currentNode = head;
        for (int i = 0; i <= index; i++)
            currentNode = currentNode.getNext();

        return currentNode.getElement();
    }

    public void set(int index, E element) throws InvalidIndexException {
        if (index < 0 || index >= size)
            throw new InvalidIndexException(index);

        Node<E> currentNode = head;
        for (int i = 0; i <= index; i++)
            currentNode = currentNode.getNext();

        currentNode.setElement(element);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
