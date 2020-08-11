package J2_L3_hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Phonebook {
    public HashMap<String, List<String>> phonebook;

    public Phonebook() {
        this.phonebook = new HashMap<>();
    }

    public void add(String surname, String number) {
        if (phonebook.containsKey(surname)) {
            phonebook.get(surname).add(number);
        } else {
            phonebook.put(surname, new ArrayList<>(Arrays.asList(number)));
        }
        System.out.println("Добавлен абонент " + surname + " " + number);
    }

    public void get(String surname) {
        if (phonebook.containsKey(surname)) {
            System.out.println(surname + ", номер абонента: " + phonebook.get(surname));
        } else {
            System.out.println(surname + " отсутствует в справочнике");
        }
    }
}

