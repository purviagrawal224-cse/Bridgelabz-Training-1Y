import java.util.*;
class Order {
    String id;
    Order(String id) {
        this.id = id;
    }
    public String toString() {
        return id;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order ob = (Order) o;
        return id.equals(ob.id);
    }
    public int hashCode() {
        return Objects.hash(id);
    }
}
public class ECommerceOrderProcessingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Order> all = new ArrayList<>();
        Set<Order> unique = new LinkedHashSet<>();
        Queue<Order> q = new LinkedList<>();
        Stack<Order> failed = new Stack<>();
        System.out.print("Enter number of orders: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            all.add(new Order(id));
        }
        for (Order o : all) {
            if (!unique.add(o)) System.out.println("Duplicate order removed: " + o);
        }
        q.addAll(unique);
        System.out.println("Processing Orders:");
        while (!q.isEmpty()) {
            Order o = q.remove();
            System.out.println("Process " + o + "? (success/fail)");
            String ans = sc.nextLine();
            if (ans.equalsIgnoreCase("fail")) failed.push(o);
            else System.out.println("Completed: " + o);
        }
        System.out.println("Re-processing Failed Orders:");
        while (!failed.isEmpty()) {
            Order o = failed.pop();
            System.out.println("Retry: " + o);
        }
    }
}
