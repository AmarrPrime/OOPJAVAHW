package org.example.Lesson2;

public class Robot extends Creature {
    public Robot(int runLength, int jumpHeight) {
        super(runLength, jumpHeight);
    }

    @Override
    public void run() {
        System.out.println("Робот бежит на максимальную дистанцию " + runLength);
    }

    @Override
    public void jump() {
        System.out.println("Робот прыгает на высоту " + jumpHeight);
    }
}
