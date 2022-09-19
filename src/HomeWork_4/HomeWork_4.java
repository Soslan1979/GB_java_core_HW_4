package HomeWork_4;

import java.util.*;

public class HomeWork_4 {

    public static void main(String[] args) {
        arrayWord();
        telephoneDirectory();
    }

    private static void arrayWord() {
        Map<String, Integer> list_ = new HashMap<>();
        String[] words = { "apple", "plum", "pear", "banana", "grapes", "pineapple",
                           "avocado", "lime", "kiwi", "pineapple", "orange", "banana",
                           "kiwi", "peach", "banana", "orange", "lemon", "apple", "avocado" };


        for (int i = 0; i < words.length; i++) {
            if (list_.containsKey(words[i]))
                list_.put(words[i], list_.get(words[i]) + 1);
            else
                list_.put(words[i], 1);
        }
        System.out.println(list_);
        System.out.println();
    }

    private static void telephoneDirectory() {
        TelephoneDirectory directory = new TelephoneDirectory();

        directory.add("Petrov", "+79991001010");
        directory.add("Ivanov", "+79991012020");
        directory.add("Petrov", "+79991012020");
        directory.add("Sidorov", "+79991013030");
        directory.add("Sidorov", "+79991014040");
        directory.add("Ivanov", "+79991015050");
        directory.add("Orlov", "+799910126060");
        directory.add("Sidorov", "+79991017070");
        directory.add("Ivanov", "+79991018080");
        directory.add("Orlov", "+79991019090");
        directory.add("Ivanov", "+79991021010");

        System.out.println(directory.get("Petrov"));
        System.out.println(directory.get("Ivanov"));
        System.out.println(directory.get("Sidorov"));
        System.out.println(directory.get("Orlov"));
    }
}

class TelephoneDirectory {
    private Map<String, List<String>> directory = new HashMap<>();
    private List<String> phoneNumberList;

    public void add(String surname, String phone_number) {
        if (directory.containsKey(surname)) {
            phoneNumberList = directory.get(surname);
        } else {
            phoneNumberList = new ArrayList<>();
        }
        phoneNumberList.add(phone_number);
        directory.put(surname, phoneNumberList);
    }

    public List<String> get(String surname) {
        return directory.get(surname);
    }
}
