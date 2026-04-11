import java.util.*;
class Product {
    double price;
    Product(double price) {
        this.price = price;
    }
    double getPrice() {
        return price;
    }
}
class Mobile extends Product {
    Mobile(double price) {
        super(price);
    }
}
class Laptop extends Product {
    Laptop(double price) {
        super(price);
    }
}
public class PriceCalculator {
    static double calculateTotal(List<? extends Product> items) {
        double sum = 0;
        for (Product p : items) sum += p.getPrice();
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Mobile> m = new ArrayList<>();
        List<Laptop> l = new ArrayList<>();
        int n1 = sc.nextInt();
        for (int i = 0; i < n1; i++) m.add(new Mobile(sc.nextDouble()));
        int n2 = sc.nextInt();
        for (int i = 0; i < n2; i++) l.add(new Laptop(sc.nextDouble()));
        System.out.println(calculateTotal(m));
        System.out.println(calculateTotal(l));
    }
}
