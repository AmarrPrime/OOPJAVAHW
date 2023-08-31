package org.example.Lesson1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Category {
    public String name;
    public Item[] items;

    public String toString() {
        String result = "";
        for (Item item : items) {
            result += name + ": " + item + "\n";
        }
        return result;
    }
}
