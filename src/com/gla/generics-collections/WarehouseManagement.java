import java.util.*;
abstract class WarehouseItem {
    abstract String type();
}
class Electronics extends WarehouseItem {
    String type() {
        return "Electronics";
    }
}
class Groceries extends WarehouseItem {
    String type() {
        return "Groceries";
    }
}
class Furniture extends WarehouseItem {
    String type() {
        return "Furniture";
    }
}
class Storage<T extends WarehouseItem> {
    List<T> items = new ArrayList<>();
    void add(T item) {
        items.add(item);
    }
    void show() {
        for (T i : items) System.out.println(i.type());
    }
}
public class WarehouseManagement {
    static void displayAll(List<? extends WarehouseItem> list) {
        for (WarehouseItem i : list) System.out.println("Item: " + i.type());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Storage<WarehouseItem> storage = new Storage<>();
        List<WarehouseItem> all = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int ch = sc.nextInt();
            WarehouseItem item = null;
            if (ch == 1) item = new Electronics();
            else if (ch == 2) item = new Groceries();
            else if (ch == 3) item = new Furniture();
            if (item != null) {
                storage.add(item);
                all.add(item);
            }
        }
        storage.show();
        displayAll(all);
    }
}
