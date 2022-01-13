package com.dataStructures;

import java.util.Scanner;

public class ArrayOpration {
    public static void main (String[] args) {
        int[] numbers = new int[5];

        System.out.println("Enter 10 Numbers");
        fill(numbers);
        System.out.println("Your Numbers Is");
        print(numbers);
    }

    public static void fill(int[] array) {
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < array.length; i++)
            array[i] = input.nextInt();
    }

    public static void print(int[] array) {
        for(int element : array)
            System.out.println(element);
    }
}
