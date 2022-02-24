package com.lab4.tutorial;

import java.util.Arrays;

public class ArrayQueue<T> implements QueueI<T>{

    protected static final int CAPACITY = 100;
    protected T[] data;
    protected int front = 0;
    protected int rear = 0;

    public ArrayQueue() {
        this(CAPACITY);
    }

    public ArrayQueue(int Size) {
        this.data =(T[]) new Object[Size];
    }


    @Override
    public int size() {
        return this.rear;
    }

    @Override
    public boolean isEmpty() {
        return this.rear == 0;
    }

    @Override
    public void enQueue(T element) {
        if( this.size() == this.data.length )
            throw new IllegalStateException("Queue Is Full!");

        this.data[(this.front + this.rear)% this.data.length] = element;
        this.rear++;
    }

    @Override
    public T deQueue() {
        if (this.isEmpty()) return null;

        T deleted = this.data[this.front];
        this.data[this.front] = null;
        this.rear--;
        this.front = (this.front + 1) % this.data.length;
        return deleted;
    }

    @Override
    public T first() {
        if (this.isEmpty()) return null;
        return this.data[this.front + this.rear];
    }

    @Override
    public String toString () {
        return "ArrayQueue" + Arrays.toString(data);
    }
}
