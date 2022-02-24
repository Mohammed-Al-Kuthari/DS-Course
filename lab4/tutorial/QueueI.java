package com.lab4.tutorial;

public interface QueueI <T> {
    int size ();
    boolean isEmpty ();
    void enQueue (T element);
    T deQueue ();
    T first ();
}
