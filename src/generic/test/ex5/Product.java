package generic.test.ex5;

import java.util.Objects;

public class Product {

    private String fruit;
    private int price;

    public Product(String fruit, int price) {
        this.fruit = fruit;
        this.price = price;
    }

    public String getFruit() {
        return fruit;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Product product = (Product) object;
        return getPrice() == product.getPrice() && Objects.equals(getFruit(), product.getFruit());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFruit(), getPrice());
    }

    @Override
    public String toString() {
        return "Product{" +
                "fruit='" + fruit + '\'' +
                ", price=" + price +
                '}';
    }
}
