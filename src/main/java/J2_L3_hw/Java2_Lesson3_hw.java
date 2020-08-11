package J2_L3_hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Java2_Lesson3_hw {

    public static void main(String[] args) {
        WordsArray(); // Задание 1
        Phonebook(); // Задание 2
    }

    public static void WordsArray() {
        ArrayList<String> wordArray = new ArrayList<>(Arrays.asList("Яблоко", "Банан", "Апельсин", "Банан", "Дыня", "Яблоко",
                "Арбуз", "Апельсин", "Яблоко", "Мандарин", "Груша", "Нектарин", "Лимон", "Арбуз", "Дыня"));
        System.out.println("Массив слов: " + wordArray);
        System.out.println("Количество слов в массиве = " + wordArray.size());

        LinkedHashSet<String> uniqueWords = new LinkedHashSet<>(wordArray);
        System.out.println("Из них уникальных слов = " + uniqueWords.size());
        System.out.println("Уникальные слова: " + uniqueWords);

        LinkedHashMap<String, Integer> countWords = new LinkedHashMap<>();
        for (int i = 0; i < wordArray.size(); i++) {
            if (countWords.containsKey(wordArray.get(i))) {
                countWords.put(wordArray.get(i), countWords.get(wordArray.get(i)) + 1);
            } else {
                countWords.put(wordArray.get(i), 1);
            }
        }
        System.out.println("Количество повторений слов: " + countWords);
        System.out.println();
    }

    public static void Phonebook() {
        Phonebook phonebook = new Phonebook();
        phonebook.add("Алексеев", "85236");
        phonebook.add("Иванов", "54862");
        phonebook.add("Семенов", "12345");
        phonebook.add("Сидоров", "32451");
        phonebook.add("Иванов", "56872");
        phonebook.add("Петров", "45874");
        phonebook.add("Семенов", "45862");
        System.out.println();

        phonebook.get("Семенов");
        phonebook.get("Алексеев");
        phonebook.get("Фролов");
    }
}
