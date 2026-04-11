import java.util.*;
class Electronics {
    String n;
    Electronics(String n) {
        this.n = n;
    }
    public String toString() {
        return n;
    }
}
class Clothing {
    String n;
    Clothing(String n) {
        this.n = n;
    }
    public String toString() {
        return n;
    }
}
class Cart<T> {
    ArrayList<T> l = new ArrayList<>();
    void addItem(T x) {
        l.add(x);
    }
    void removeItem(T x) {
        l.remove(x);
    }
    void displayItems() {
        for (T i : l) {
            System.out.println(i);
        }
    }
}
public class GenericCart {
    public static void main(String[] args) {
        Cart<Electronics> e = new Cart<>();
        e.addItem(new Electronics("Laptop"));
        e.addItem(new Electronics("Phone"));
        System.out.println("Electronics Cart:");
        e.displayItems();
        Cart<Clothing> c = new Cart<>();
        c.addItem(new Clothing("Shirt"));
        c.addItem(new Clothing("Jeans"));
        System.out.println("Clothing Cart:");
        c.displayItems();
    }
}