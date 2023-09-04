package org.example.Lesson2;

public class Human extends Mammal {

    public Human(int runLength, int jumpHeight) {
        super(runLength, jumpHeight);
    }

    @Override
    public void run() {
        System.out.println("Человек бежит на максимальную дистанцию " + runLength);
    }

    @Override
    public void jump() {
        System.out.println("Человек прыгает на высоту " + jumpHeight);
    }
}
