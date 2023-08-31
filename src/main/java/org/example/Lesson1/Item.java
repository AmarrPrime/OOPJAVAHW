package org.example.Lesson1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Item {
    public String name;
    public int price;
    public int rating;

    public String toString() {
        return name + " " + price + " " + rating;
    }
}
