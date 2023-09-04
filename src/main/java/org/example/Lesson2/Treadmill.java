package org.example.Lesson2;

public class Treadmill extends Obstacle {

    public Treadmill(int difficulty) {
        super(difficulty);
    }

    public boolean isPassed(Creature creature) {
        creature.run();
        if (creature.runLength > difficulty) {
            System.out.println("Дистанцию удалось преодолеть");
            return true;
        }
        System.out.println("Дистанцию не удалось преодолеть");
        return false;
    }
}
