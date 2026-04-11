import java.util.*;
class Product {
    String name;
    int price, stock;
    Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    public String toString() {
        return name + " " + price + " " + stock;
    }
}
public class InventoryAndRestockManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> names = new HashSet<>();
        List<Product> list = new ArrayList<>();
        Queue<Product> restockQ = new LinkedList<>();
        Stack<Product> st = new Stack<>();
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            int price = sc.nextInt();
            int stock = sc.nextInt();
            sc.nextLine();
            if (!names.add(name)) {
                System.out.println("Duplicate product ignored: " + name);
                continue;
            }
            Product p = new Product(name, price, stock);
            list.add(p);
            if (stock < 5) restockQ.add(p);
        }
        System.out.println("Restocking Products:");
        while (!restockQ.isEmpty()) {
            Product p = restockQ.remove();
            System.out.println("Enter restock amount for " + p.name + ":");
            int add = sc.nextInt();
            sc.nextLine();
            p.stock += add;
            st.push(p);
            System.out.println("Updated: " + p);
        }
        System.out.println("Undo last restock? (yes/no)");
        String ans = sc.nextLine();
        if (ans.equalsIgnoreCase("yes") && !st.isEmpty()) {
            Product p = st.pop();
            System.out.println("Enter amount to rollback for " + p.name + ":");
            int sub = sc.nextInt();
            p.stock -= sub;
            System.out.println("After rollback: " + p);
        }
        System.out.println("Final Products:");
        for (Product p : list) System.out.println(p);
    }
}
