package org.example.Lesson4;

import java.util.List;

public interface UserService<T extends User> {
    List<T> getAll();

    void create(String name, int score, int age);
}
