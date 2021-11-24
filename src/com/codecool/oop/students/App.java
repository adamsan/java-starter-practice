package com.codecool.oop.students;

import java.util.Collections;
import java.util.List;

/**
 * Task:
 * - Modell a Student class with name and age.
 * - Create a StudentDAO interface, with a method to find all students
 * - Create a simple, in-memory implementation for it.
 * - In main, query the students in a list.
 * - Print all student - print should display the student's name, and age.
 * - Order the students - default ordering should be ascending by age,
 * students with the same age should be ordered by name. HINT: use Comparable interface
 * - Order the students - descending by age. HINT: create a custom Comparator
 */
public class App {
    public static void main(String[] args) {
        StudentDAO studentDAO = new InMemoryStudentDAO();
        List<Student> students = studentDAO.findAll();
        System.out.println("Unordered students:");
        printStudents(students);

        System.out.println("Ordered students:");
        Collections.sort(students);
        printStudents(students);

        System.out.println("Custom ordered students:");
        Collections.sort(students, new StudentComparator());
        printStudents(students);
    }

    private static void printStudents(List<Student> students) {
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
