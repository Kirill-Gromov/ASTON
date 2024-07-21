package DZ.Lesson6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        // Добавляем записи в телефонный справочник
        phoneBook.add("Ivanov", "123456789");
        phoneBook.add("Ivanov", "987654321");
        phoneBook.add("Petrov", "111111111");
        phoneBook.add("Sidorov", "222222222");
        phoneBook.add("Nikolaev", "989765623");

        // Выполняем поиск номеров по фамилии
        System.out.println("Ivanov: " + phoneBook.get("Ivanov"));
        System.out.println("Petrov: " + phoneBook.get("Petrov"));
        System.out.println("Sidorov: " + phoneBook.get("Sidorov"));
        System.out.println("Nikolaev: " + phoneBook.get("Nikolaev"));
    }

    // HashMap для хранения фамилий и списков их телефонных номеров
    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    // Метод для добавления записей
    public void add(String lastName, String phoneNumber) {
        if (!phoneBook.containsKey(lastName)) {
            phoneBook.put(lastName, new ArrayList<>());
        }
        phoneBook.get(lastName).add(phoneNumber);
    }

    // Метод для поиска номеров по фамилии
    public List<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, new ArrayList<>());
    }
}

