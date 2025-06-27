package TaskTwo;

import java.util.HashSet;
import java.util.Set;

public class Main {

    // TODO: Напишите метод, который принимает на вход два множества Set и возвращает новое множество,
    //  содержащее все элементы из обоих исходных множеств.

    public static void main(String[] args) {
        Set<String> firsdtSet = new HashSet<>();
        Set<String> secondSet = new HashSet<>();

        firsdtSet.add("Собака");
        firsdtSet.add("Кошка");
        firsdtSet.add("Змея");
        firsdtSet.add("Лось");
        firsdtSet.add("Рыба");

        secondSet.add("Выдра");
        secondSet.add("Кошка");
        secondSet.add("Лиса");
        secondSet.add("Волк");
        secondSet.add("Собака");

        System.out.println(join(firsdtSet, secondSet));

    }

    public static Set<String> join(Set<String> firsdtSet, Set<String> secondSet) {
        Set<String> resultSet = new HashSet<>(firsdtSet);
        resultSet.addAll(secondSet);
        return resultSet;
    }
}
