package com.lab3.tutorial;

import java.util.Arrays;
import java.util.Scanner;

public class Entry {

    public static void main(String[] args) {
//        Stack<String> mystack = new ArrayStack<String>(5);
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Stack is empty: " + mystack.isEmpty());
//
//        for (int i = 0; i < 5; i++) {
//            mystack.push(input.next());
//            System.out.println("Last Element: " + mystack.top());
//            System.out.println("Stack Size: " + mystack.size());
//            System.out.println("Stack is Empty: " + mystack.isEmpty());
//        }
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Deleted Element: " + mystack.pop());
//            System.out.println("Last Element After Delete: " + mystack.top());
//            System.out.println("Stack Size After Delete: " + mystack.size());
//            System.out.println("Stack is Empty After Delete: " + mystack.isEmpty());
//        }

        // Reverse array using Stack
        String[] names = {"Mohammed", "Ali", "Ahmed", "waled"};
        Stack<String> stack = new ArrayStack<String>(names.length);
        System.out.println(Arrays.toString(names));
        for (int i = 0; i < names.length; i++) {
            stack.push(names[i]);
        }
        for (int i = 0; i < names.length; i++) {
            names[i] = stack.pop();
        }
        System.out.println(Arrays.toString(names));

    }
}
