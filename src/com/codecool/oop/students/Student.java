package com.codecool.oop.students;

public class Student implements Comparable<Student> {
    public final String name;
    public final int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " [" + age + ']';
    }

    @Override
    public int compareTo(Student o) {
        if (this.age == o.age) return this.name.compareTo(o.name);
        return this.age < o.age ? -1 : 1;
    }
}
