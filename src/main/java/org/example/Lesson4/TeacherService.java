package org.example.Lesson4;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher> {
    private List<Teacher> teachers = new ArrayList<>();

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String name, int score, int age) {

    }

    @Override
    public void create(String name, int experience, int age, String subject) {
        Teacher teacher = new Teacher(name, age, experience, subject);
        teachers.add(teacher);
    }

    @Override
    public void modify(String name, String newName, int experience, int age, String subject) {
        for (Teacher teacher : teachers) {
            if (teacher.getName().equals(name)) {
                teacher.setName(newName);
                teacher.setAge(age);
                teacher.setExperience(experience);
                teacher.setSubject(subject);
            }
        }
    }
}
