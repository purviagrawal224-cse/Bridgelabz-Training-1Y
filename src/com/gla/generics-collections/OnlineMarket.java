import java.util.*;
class BookCategory {}
class ClothingCategory {}
class GadgetCategory {}
class Product<T> {
    String n;
    double p;
    T c;
    Product(String n, double p, T c) {
        this.n = n;
        this.p = p;
        this.c = c;
    }
    double getPrice() {
        return p;
    }
    void setPrice(double p) {
        this.p = p;
    }
    void show() {
        System.out.println(n + " " + p);
    }
}
public class OnlineMarket {
    static <T extends Product<?>> void applyDiscount(T x, double per) {
        double np = x.getPrice() - (x.getPrice() * per / 100);
        x.setPrice(np);
    }
    public static void main(String[] args) {
        Product<BookCategory> b = new Product<>("JavaBook", 500, new BookCategory());
        Product<ClothingCategory> c = new Product<>("Shirt", 1000, new ClothingCategory());
        Product<GadgetCategory> g = new Product<>("Phone", 20000, new GadgetCategory());
        List<Product<?>> l = new ArrayList<>();
        l.add(b);
        l.add(c);
        l.add(g);
        applyDiscount(b, 10);
        applyDiscount(c, 20);
        applyDiscount(g, 5);
        for (Product<?> i : l) {
            i.show();
        }
    }
}