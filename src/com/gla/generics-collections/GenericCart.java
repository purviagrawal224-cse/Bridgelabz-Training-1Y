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
        Scanner sc = new Scanner(System.in);
        Cart<Electronics> eCart = new Cart<>();
        Cart<Clothing> cCart = new Cart<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int ch = sc.nextInt();
            sc.nextLine();
            if (ch == 1) {
                String name = sc.nextLine();
                eCart.addItem(new Electronics(name));
            }
            else if (ch == 2) {
                String name = sc.nextLine();
                cCart.addItem(new Clothing(name));
            }
        }
        eCart.displayItems();
        cCart.displayItems();
    }
}
