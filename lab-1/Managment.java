package com.dataStructures;

public class Managment {
    public static void main (String[] args) {
        Student[] students = new Student[3];

        students[0] = new Student(1, "Mohammed");
        students[1] = new Student(2, "Ali");
        students[2] = new Student(3, "Waled");

        for(Student student : students)
        System.out.println(student);
    }
}
