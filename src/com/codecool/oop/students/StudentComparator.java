package com.codecool.oop.students;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.age == o2.age) return 0;
        return o1.age < o2.age ? 1 : -1;
    }
}
