import java.util.*;
class Product {
    String name;
    double price;
    int stock;
    Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    public String toString() {
        return name + " " + price + " " + stock;
    }
}
public class InventoryRestockManagement {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        List<Product> products = new ArrayList<>();
        Queue<Product> restockQ = new LinkedList<>();
        Stack<Product> st = new Stack<>();
        Product p1 = new Product("Milk", 50, 2);
        Product p2 = new Product("Bread", 30, 10);
        Product p3 = new Product("Eggs", 60, 1);
        Product p4 = new Product("Milk", 50, 5);
        if (names.add(p1.name)) products.add(p1);
        if (names.add(p2.name)) products.add(p2);
        if (names.add(p3.name)) products.add(p3);
        if (names.add(p4.name)) products.add(p4);
        for (Product p : products) {
            if (p.stock < 5) restockQ.add(p);
        }
        System.out.println("Restocking:");
        while (!restockQ.isEmpty()) {
            Product p = restockQ.remove();
            p.stock += 10;
            System.out.println("Restocked: " + p);
            st.push(p);
        }
        System.out.println("Undo Last Restock:");
        if (!st.isEmpty()) {
            Product p = st.pop();
            p.stock -= 10;
            System.out.println("Rolled Back: " + p);
        }
        System.out.println("Final Products:");
        for (Product p : products) System.out.println(p);
    }
}