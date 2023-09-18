package org.example.Lesson4;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements UserService<Student> {
    private List<Student> students = new ArrayList<>();

    @Override
    public List<Student> getAll() {

        return students;
    }

    @Override
    public void create(String name, int score, int age) {
        Student student = new Student(name, age, score);
        students.add(student);
    }
}
