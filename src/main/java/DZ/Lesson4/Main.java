package DZ.Lesson4;

public class Main {
    public static void main(String[] args) {
        Dog dogBobik = new Dog("Бобик");
        dogBobik.run(150);
        dogBobik.run(550);

        dogBobik.swim(5);
        dogBobik.swim(15);

        Cat catMurzik = new Cat("Мурзик");
        catMurzik.run(100);
        catMurzik.run(250);
        catMurzik.swim(5);

        Bowl bowl = new Bowl(10);

        Cat[] cats = {new Cat("Мурзик"), new Cat("Барсик"), new Cat("Васька")};
        for (Cat cat : cats) {
            cat.eat(bowl, 5);
        }

        for (Cat cat : cats) {
            System.out.println(cat.name + " сытость: " + (cat.isSatiety() ? "Сыт" : "Голоден"));
        }

        System.out.println("Всего животных: " + Animal.getTotalAnimals());
        System.out.println("Всего котов: " + Cat.getTotalCats());
        System.out.println("Всего собак: " + Dog.getTotalDogs());
    }
}

/*
Класс Animal - Абстрактный базовый класс, от которого наследуются Cat и Dog. Он отслеживает общее количество созданных животных.
Класс Dog - Реализует методы run и swim согласно ограничениям для собак.
Класс Cat - Реализует методы run и swim с ограничениями для кошек, а также добавляет метод eat для возможности кушать из миски.
Класс Bowl - Управляет количеством еды и позволяет добавлять в нее еду.
Класс Main - Тестирует созданные объекты и проверяет выполнение заданных условий.

 */