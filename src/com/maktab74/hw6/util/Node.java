package com.maktab74.hw6.util;

public class Node<E> {

    private Node<E> previous;
    private Node<E> next;
    private E element;

    public Node() {
    }

    public Node(E element) {
        this.element = element;
    }

    public Node<E> getPrevious() {
        return previous;
    }

    public void setPrevious(Node<E> previous) {
        this.previous = previous;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public boolean hasPrevious() {
        return previous != null;
    }

    public boolean hasNext() {
        return next != null;
    }
}
