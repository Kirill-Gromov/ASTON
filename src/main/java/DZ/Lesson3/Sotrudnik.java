package DZ.Lesson3;

public class Sotrudnik {
    // Основной метод
    public static void main(String[] args) {
        Sotrudnik sotrudnik = new Sotrudnik("Громов Кирилл Александрович", "Тестировщик", "oiboi899@gmail.com", "+79001234567", 200000, 20);

        // Вызов метода для вывода информации об объекте
        sotrudnik.printInfo();
    }
    // Поля класса
    private String fio;
    private String dolzhnost;
    private String email;
    private String telefon;
    private double zarplata;
    private int vozrast;

    // Конструктор класса
    public Sotrudnik(String fio, String dolzhnost, String email, String telefon, double zarplata, int vozrast) {
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

