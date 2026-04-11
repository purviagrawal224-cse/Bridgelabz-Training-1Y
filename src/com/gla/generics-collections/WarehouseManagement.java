import java.util.*;
abstract class WarehouseItem {
    String n;
    WarehouseItem(String n) {
        this.n = n;
    }
    void show() {
        System.out.println(n);
    }
}
class Electronics extends WarehouseItem {
    Electronics(String n) {
        super(n);
    }
}
class Groceries extends WarehouseItem {
    Groceries(String n) {
        super(n);
    }
}
class Furniture extends WarehouseItem {
    Furniture(String n) {
        super(n);
    }
}
class Storage<T extends WarehouseItem> {
    ArrayList<T> l = new ArrayList<>();
    void addItem(T x) {
        l.add(x);
    }
    void displayItems() {
        for (T i : l) {
            i.show();
        }
    }
}
public class WarehouseManagement {
    static void displayAll(Storage<? extends WarehouseItem> s) {
        s.displayItems();
    }
    public static void main(String[] args) {
        Storage<Electronics> e = new Storage<>();
        e.addItem(new Electronics("TV"));
        e.addItem(new Electronics("Laptop"));
        Storage<Groceries> g = new Storage<>();
        g.addItem(new Groceries("Rice"));
        g.addItem(new Groceries("Milk"));
        Storage<Furniture> f = new Storage<>();
        f.addItem(new Furniture("Chair"));
        f.addItem(new Furniture("Table"));
        System.out.println("Electronics:");
        displayAll(e);
        System.out.println("Groceries:");
        displayAll(g);
        System.out.println("Furniture:");
        displayAll(f);
    }
}