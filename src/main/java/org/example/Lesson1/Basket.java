package org.example.Lesson1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Basket {
    public Item[] items;

    public String toString() {
        String result = "Корзина: [\n";
        for (Item item : items) {
            result += item + "\n";
        }
        result += "]\n";
        return result;
    }
}
