package org.example.Lesson2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Obstacle {
    public int difficulty;

    public abstract boolean isPassed(Creature creature);
}
