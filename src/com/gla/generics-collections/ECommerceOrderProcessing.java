import java.util.*;
class Order {
    int id;
    String item;
    Order(int id, String item) {
        this.id = id;
        this.item = item;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order x = (Order) o;
        return id == x.id;
    }
    public int hashCode() {
        return Objects.hash(id);
    }
    public String toString() {
        return id + " " + item;
    }
}
public class ECommerceOrderProcessing {
    public static void main(String[] args) {
        List<Order> all = new ArrayList<>();
        all.add(new Order(1, "Laptop"));
        all.add(new Order(2, "Phone"));
        all.add(new Order(1, "Laptop"));
        all.add(new Order(3, "Tablet"));
        Set<Order> unique = new LinkedHashSet<>(all);
        Queue<Order> q = new LinkedList<>(unique);
        Stack<Order> st = new Stack<>();
        System.out.println("Processing Orders:");
        while (!q.isEmpty()) {
            Order o = q.remove();
            if (o.id % 2 == 0) {
                System.out.println("Failed: " + o);
                st.push(o);
            }
	    else System.out.println("Processed: " + o);
        }
        System.out.println("Reprocessing Failed Orders:");
        while (!st.isEmpty()) System.out.println("Processed: " + st.pop());
    }
}