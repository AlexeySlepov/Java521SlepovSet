package TaskFive;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    // TODO: Создайте класс Product с полями name, price (double) и rating (int). Отсортируйте товары:
    //  1. Сначала по цене (от дешевых к дорогим).
    //  2. Если цена одинаковая – по рейтингу (от высокого к низкому).

    public static void main(String[] args) {
        Set<Product> products = new TreeSet<>();
        products.add(new Product("Молоко", 1, 100));
        products.add(new Product("Ветчина", 2, 300));
        products.add(new Product("Хлеб", 1, 60));
        products.add(new Product("Печенье", 3, 120));
        products.add(new Product("Чай", 2, 120));

        for (Product product : products) {
            System.out.println(product);
        }
    }
}
