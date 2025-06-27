package TaskFive;

import java.util.Objects;

public class Product implements Comparable<Product> {

    String name;
    double price;
    int rating;

    public Product(String name, int rating, double price) {
        this.name = name;
        this.rating = rating;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }

    @Override
    public int compareTo(Product product) {
        int result = Double.compare(this.price, product.price);

        if (result == 0) {
            result = Integer.compare(this.rating, product.rating);
        }

        return result;
    }
}
