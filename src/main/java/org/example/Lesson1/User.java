package org.example.Lesson1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class User {
    public String login;
    public String password;
    public Basket basket;

    public String toString() {
        return login + " " + password + " " + basket;
    }
}
