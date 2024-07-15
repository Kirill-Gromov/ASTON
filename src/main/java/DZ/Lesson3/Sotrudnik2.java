package DZ.Lesson3;

public class Sotrudnik2 {
    // Основной метод
    public static void main(String[] args) {
        Sotrudnik2[] sotrudniki = new Sotrudnik2[5];

        // Инициализация элементов массива объектами класса Сотрудник
        sotrudniki[0] = new Sotrudnik2("Иванов Иван Иванович", "Инженер", "ivivan@mailbox.com", "892312312", 30000, 30);
        sotrudniki[1] = new Sotrudnik2("Сидоров Сергей Сергеевич", "Программист", "ssergey@mailbox.com", "892312313", 40000, 25);
        sotrudniki[2] = new Sotrudnik2("Петров Петр Петрович", "Тестировщик", "ppetrov@mailbox.com", "892312314", 35000, 28);
        sotrudniki[3] = new Sotrudnik2("Алексеева Алина Александровна", "Менеджер", "aalina@mailbox.com", "892312315", 45000, 32);
        sotrudniki[4] = new Sotrudnik2("Николаев Николай Николаевич", "Аналитик", "nnikolay@mailbox.com", "892312316", 38000, 26);

        // Вывод информации о каждом сотруднике
        for (Sotrudnik2 sotrudnik : sotrudniki) {
            sotrudnik.printInfo();
            System.out.println(); // Пустая строка для разделения информации о разных сотрудниках
        }
    }
    // Поля класса
    private String fio;
    private String dolzhnost;
    private String email;
    private String telefon;
    private double zarplata;
    private int vozrast;

    // Конструктор класса
    public Sotrudnik2(String fio, String dolzhnost, String email, String telefon, double zarplata, int vozrast) {
        this.fio = fio;
        this.dolzhnost = dolzhnost;
        this.email = email;
        this.telefon = telefon;
        this.zarplata = zarplata;
        this.vozrast = vozrast;
    }

    // Метод для вывода информации об объекте
    public void printInfo() {
        System.out.println("ФИО: " + fio);
        System.out.println("Должность: " + dolzhnost);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + telefon);
        System.out.println("Зарплата: " + zarplata);
        System.out.println("Возраст: " + vozrast);
    }
}

