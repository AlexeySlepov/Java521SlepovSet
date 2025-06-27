package TaskOne;

import java.util.HashSet;
import java.util.Set;

public class Main {
    //TODO: Напишите метод, который принимает на вход строку и проверяет,
    // содержит ли она все уникальные символы.
    // Метод должен вернуть true, если все символы в строке уникальны,
    // и false в противном случае.
    public static void main(String[] args) {
        String firstStr = "Один человек";
        String secondStr = "Две собаки";

        System.out.println(isUnique(firstStr) ? "все символы в строке уникальны" : "не все символы в строке уникальны");
        System.out.println(isUnique(secondStr) ? "все символы в строке уникальны" : "не все символы в строке уникальны");
    }

    public static boolean isUnique(String string) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            if (!set.contains(string.charAt(i))) {
                set.add(string.charAt(i));
            }
        }
        return set.size() == string.length();
    }
}
