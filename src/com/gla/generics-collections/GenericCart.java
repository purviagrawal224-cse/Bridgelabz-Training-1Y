import java.util.*;
class Electronics {
    String name;
    Electronics(String name) {
        this.name = name;
    }
    public String toString() {
        return "Electronics: " + name;
    }
}
class Clothing {
    String name;
    Clothing(String name) {
        this.name = name;
    }
    public String toString() {
        return "Clothing: " + name;
    }
}
class Cart<T> {
    List<T> list = new ArrayList<>();
    void addItem(T item) {
        list.add(item);
    }
    void removeItem(T item) {
        list.remove(item);
    }
    void displayItems() {
        for (T i : list) System.out.println(i);
    }
}
public class GenericCart {
    public static void main(String[] args) {
        Cart<Electronics> eCart = new Cart<>();
        Cart<Clothing> cCart = new Cart<>();
        eCart.addItem(new Electronics("Mobile"));
        eCart.addItem(new Electronics("Laptop"));
        cCart.addItem(new Clothing("Shirt"));
        cCart.addItem(new Clothing("Jeans"));
        eCart.displayItems();
        cCart.displayItems();
    }
}
