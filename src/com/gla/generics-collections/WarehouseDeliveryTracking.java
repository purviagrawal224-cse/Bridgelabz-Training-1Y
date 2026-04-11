import java.util.*;
class Package {
    String id;
    String item;
    Package(String id, String item) {
        this.id = id;
        this.item = item;
    }
    public String toString() {
        return id + " " + item;
    }
}
public class WarehouseDeliveryTracking {
    public static void main(String[] args) {
        Queue<Package> q = new LinkedList<>();
        Set<String> ids = new HashSet<>();
        List<Package> delivered = new ArrayList<>();
        Stack<Package> returned = new Stack<>();
        Package p1 = new Package("P1", "Laptop");
        Package p2 = new Package("P2", "Phone");
        Package p3 = new Package("P1", "Laptop");
        Package p4 = new Package("P3", "TV");
        if (ids.add(p1.id)) q.add(p1);
        if (ids.add(p2.id)) q.add(p2);
        if (ids.add(p3.id)) q.add(p3);
        if (ids.add(p4.id)) q.add(p4);
        System.out.println("Processing Deliveries:");
        while (!q.isEmpty()) {
            Package p = q.remove();
            if (p.id.equals("P2")) {
                System.out.println("Returned: " + p);
                returned.push(p);
            }
	    else {
                System.out.println("Delivered: " + p);
                delivered.add(p);
            }
        }
        System.out.println("Delivered Packages:");
        for (Package p : delivered) System.out.println(p);
        System.out.println("Returned Packages:");
        while (!returned.isEmpty()) System.out.println(returned.pop());
    }
}