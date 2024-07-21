package DZ.Lesson6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueWordCounter {
    public static void main(String[] args) {
        // Массив с набором слов, включая повторяющиеся
        String[] words = {"apple", "orange", "banana", "apple", "kiwi", "banana", "grape", "kiwi", "pear", "apple"};

        // Для хранения уникальных слов используем HashSet
        Set<String> uniqueWords = new HashSet<>();

        // Для подсчёта количества вхождений каждого слова используем HashMap
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Заполняем коллекции
        for (String word : words) {
            uniqueWords.add(word);
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // Выводим список уникальных слов
        System.out.println("Уникальные слова:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }

        // Выводим количество вхождений каждого слова
        System.out.println("\nКоличество вхождений каждого слова:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
