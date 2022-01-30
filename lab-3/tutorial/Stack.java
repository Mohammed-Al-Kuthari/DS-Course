package com.lab3.tutorial;

public interface Stack <T> {
    public boolean isEmpty ();
    public int size ();
    public void push (T element);
    public T pop ();
    public T top ();
}