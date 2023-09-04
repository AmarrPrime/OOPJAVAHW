package org.example.Lesson2;
/*
1)Создайте три класса: Человек, Кот, Робот, которые не наследуются от одного класса но есть общий класс родитель.
 Эти классы должны уметь бегать и прыгать, все также с выводом информации о действии в консоль.
2) Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
печатаем в консоль (успешно пробежал, не смог пробежать и т.д.). У препятствий есть длина
(для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
3) Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
этот набор препятствий. Если участник не смог пройти одно из препятствий, то дальше по
списку он препятствий не идет.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Creature> creatures = generateCreatures(7);
        List<Obstacle> obstacles = generateObstacles(4);

        for (Obstacle obstacle : obstacles) {
            System.out.println("Препятствие со сложностью " + obstacle.difficulty);
            List<Creature> passedCreatures = new ArrayList<>();
            for (Creature creature : creatures) {
                boolean result = obstacle.isPassed(creature);
                if (result) {
                    passedCreatures.add(creature);
                }
            }
            creatures = passedCreatures;
            System.out.println("");
        }
    }

    private static List<Creature> generateCreatures(int amount) {
        Random random = new Random();
        List<Creature> creatures = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            int creatureID = random.nextInt(3);
            Creature creature = null;
            switch (creatureID) {
                case 0:
                    creature = new Robot(random.nextInt(1, 10), random.nextInt(1, 10));
                    break;
                case 1:
                    creature = new Human(random.nextInt(1, 10), random.nextInt(1, 10));
                    break;
                case 2:
                    creature = new Cat(random.nextInt(1, 10), random.nextInt(1, 10));
                    break;
            }
            creatures.add(creature);
        }
        return creatures;
    }


    private static List<Obstacle> generateObstacles(int amount) {
        Random random = new Random();
        List<Obstacle> obstacles = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            int obstacleID = random.nextInt(2);
            Obstacle obstacle = null;
            switch (obstacleID) {
                case 0:
                    obstacle = new Wall(random.nextInt(1, 10));
                    break;
                case 1:
                    obstacle = new Treadmill(random.nextInt(1, 10));
                    break;
            }
            obstacles.add(obstacle);
        }
        return obstacles;
    }

}
