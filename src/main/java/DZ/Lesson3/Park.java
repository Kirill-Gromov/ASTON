package DZ.Lesson3;

public class Park {
    // Основной метод
    public static void main(String[] args) {
        Park park = new Park();

        // Создание объектов внутреннего класса Attraction
        Attraction rollerCoaster = park.new Attraction("Американские горки", "10:00 - 22:00", 500);
        Attraction ferrisWheel = park.new Attraction("Колесо обозрения", "11:00 - 23:00", 300);
        Attraction hauntedHouse = park.new Attraction("Дом с призраками", "12:00 - 00:00", 400);

        // Вывод информации о каждом аттракционе
        rollerCoaster.printInfo();
        System.out.println();
        ferrisWheel.printInfo();
        System.out.println();
        hauntedHouse.printInfo();
    }
    // Вложенный класс Attraction
    public class Attraction {
        private String name;       // Название аттракциона
        private String workTime;   // Время работы аттракциона
        private double cost;       // Стоимость посещения аттракциона

        // Конструктор вложенного класса
        public Attraction(String name, String workTime, double cost) {
            this.name = name;
            this.workTime = workTime;
            this.cost = cost;
        }

        // Метод для вывода информации об аттракционе
        public void printInfo() {
            System.out.println("Название аттракциона: " + name);
            System.out.println("Время работы: " + workTime);
            System.out.println("Стоимость: " + cost + " руб.");
        }
    }
}

