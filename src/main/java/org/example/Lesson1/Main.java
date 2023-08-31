package org.example.Lesson1;
/*
1)Создать класс Товар, имеющий переменные имя, цена, рейтинг.
2)Создать класс Категория, имеющий переменные имя и массив товаров.
 Создать несколько объектов класса Категория.
3)Создать класс Basket, содержащий массив купленных товаров.
4)Создать класс User, содержащий логин, пароль и объект класса Basket.
 Создать несколько объектов класса User.
5)Вывести на консоль каталог продуктов. (все продукты магазина)
6)Вывести на консоль покупки посетителей магазина. (После покупки у пользователя добавляется товар, а из
 магазина - удаляется)
 */

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("хлеб", 10, 10);
        Item item2 = new Item("молоко", 14, 9);
        Item item3 = new Item("яйца", 16, 8);
        Item item4 = new Item("творог", 18, 10);
        Item item5 = new Item("батон", 7, 5);

        Category cat1 = new Category("выпечка",new Item[]{item1,item5});
        Category cat2 = new Category("молочка",new Item[]{item2,item3,item4});

        User user1 = new User("login","pass",new Basket(new Item[]{item1,item2,item3}));
        User user2 = new User("log","passwelt",new Basket(new Item[]{item4,item5}));

        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(user1);
        System.out.println(user2);
    }
}
