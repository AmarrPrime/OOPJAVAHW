package org.example.Lesson2;

public class Wall extends Obstacle {

    public Wall(int difficulty) {
        super(difficulty);
    }

    public boolean isPassed(Creature creature) {
        creature.jump();
        if (creature.jumpHeight > difficulty) {
            System.out.println("Стену удалось перепрыгнуть");
            return true;
        }
        System.out.println("Стену не удалось перепрыгнуть");
        return false;
    }
}
