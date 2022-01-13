package com.dataStructures;

import java.util.Scanner;

public class FillArray {
    public static void main (String[] args) {
        int[] numbers = new int[10];

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 Numbers");
        for (int i = 0; i< numbers.length; i++)
            numbers[i] = input.nextInt();

        System.out.println("Your Numbers is");

        for (int number : numbers)
            System.out.println(number);
    }
}
