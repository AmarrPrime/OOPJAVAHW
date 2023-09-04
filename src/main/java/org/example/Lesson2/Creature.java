package org.example.Lesson2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Creature {
    public int runLength;
    public int jumpHeight;
    public abstract void run();
    public abstract void jump();
}
