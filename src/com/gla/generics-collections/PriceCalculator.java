import java.util.*;
class Product {
    double p;
    Product(double p) {
        this.p = p;
    }
    double getPrice() {
        return p;
    }
}
class Mobile extends Product {
    Mobile(double p) {
        super(p);
    }
}
class Laptop extends Product {
    Laptop(double p) {
        super(p);
    }
}
public class PriceCalculator {
    static double calculateTotal(List<? extends Product> items) {
        double s = 0;
        for (Product x : items) {
            s += x.getPrice();
        }
        return s;
    }
    public static void main(String[] args) {
        List<Mobile> m = Arrays.asList(
                new Mobile(10000),
                new Mobile(20000)
        );
        List<Laptop> l = Arrays.asList(
                new Laptop(50000),
                new Laptop(70000)
        );
        System.out.println(calculateTotal(m));
        System.out.println(calculateTotal(l));
    }
}