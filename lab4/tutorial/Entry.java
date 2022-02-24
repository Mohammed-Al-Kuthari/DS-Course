package com.lab4.tutorial;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Entry {
    public static void main (String[] args) {
//        QueueI<Integer> queue = new ArrayQueue<Integer>(4);
//        queue.enQueue(1);
//        queue.enQueue(2);
//        queue.enQueue(3);
//        queue.enQueue(4);
//
//        System.out.println(queue.deQueue());
//        System.out.println(queue.deQueue());
//        System.out.println(queue.deQueue());
//        System.out.println(queue.deQueue());
//        System.out.println(queue);
//        System.out.println(queue.isEmpty());

        // printer example
        QueueI<String> queue = new ArrayQueue<String>(3);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Tree Files Path: ");
        for (int i = 0; i < 3; i++) {
            queue.enQueue(input.nextLine());
        }

        while (!queue.isEmpty()) {
            try {

                Scanner file = new Scanner(new File(queue.deQueue()));
                while (file.hasNextLine())
                    System.out.println(file.nextLine());

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
