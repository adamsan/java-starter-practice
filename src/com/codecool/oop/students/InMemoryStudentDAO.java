package com.codecool.oop.students;

import java.util.ArrayList;
import java.util.List;

public class InMemoryStudentDAO implements StudentDAO {

    @Override
    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Peter", 12));
        students.add(new Student("Susan", 15));
        students.add(new Student("Greta", 11));
        students.add(new Student("Tom", 14));
        students.add(new Student("Anna", 14));
        students.add(new Student("Brandon", 10));
        students.add(new Student("Agatha", 16));
        return students;
    }
}
