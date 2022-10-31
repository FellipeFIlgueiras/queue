package br.com.queue;

import java.util.LinkedList;

public class Queue<T> {

    private LinkedList<T> linkedList;

    public Queue() {
        this.linkedList = new LinkedList<>();
    }

    public void add(T element) {
        this.linkedList.add(element);
    }

    public T get() {
        if(isEmpty()) return null;
        T element = linkedList.getFirst();
        this.linkedList.remove(0);
        return element;
    }

    public boolean isEmpty() {
        return this.linkedList.isEmpty();
    }

}