package org.example.Lesson2;

public class Cat extends Mammal{

    public Cat(int runLength, int jumpHeight) {
        super(runLength, jumpHeight);
    }

    @Override
    public void run() {
        System.out.println("Кот бежит на максимальную дистанцию " + runLength);
    }

    @Override
    public void jump() {
        System.out.println("Кот прыгает на высоту " + jumpHeight);
    }
}
