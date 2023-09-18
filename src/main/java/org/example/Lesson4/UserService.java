package org.example.Lesson4;

import java.util.List;

public interface UserService<T extends User> {

    List<T> getAll();

    void create(String name, int score, int age);
    void create(String name, int experience, int age, String subject);

    void modify(String name,String newName, int experience, int age, String subject);

}
