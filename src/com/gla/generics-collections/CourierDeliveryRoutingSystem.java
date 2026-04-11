import java.util.*;
class Parcel implements Comparable<Parcel> {
    String id;
    int priority;
    Parcel(String id, int priority) {
        this.id = id;
        this.priority = priority;
    }
    public int compareTo(Parcel o) {
        return o.priority - this.priority;
    }
    public String toString() {
        return id + " (P=" + priority + ")";
    }
}
public class CourierDeliveryRoutingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Parcel> pq = new PriorityQueue<>();
        Queue<Parcel> normal = new LinkedList<>();
        Set<String> ids = new HashSet<>();
        List<Parcel> done = new ArrayList<>();
        System.out.print("Enter number of parcels: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            int p = sc.nextInt();
            sc.nextLine();
            if (ids.contains(id)) {
                System.out.println("Duplicate ID ignored: " + id);
                continue;
            }
            ids.add(id);
            Parcel parcel = new Parcel(id, p);
            if (p > 5) pq.add(parcel);
            else normal.add(parcel);
        }
        System.out.println("Processing Parcels:");
        while (!pq.isEmpty()) {
            Parcel p = pq.remove();
            System.out.println("Delivered (Priority): " + p);
            done.add(p);
        }
        while (!normal.isEmpty()) {
            Parcel p = normal.remove();
            System.out.println("Delivered (Normal): " + p);
            done.add(p);
        }
        System.out.println("Completed Deliveries:");
        for (Parcel p : done) System.out.println(p);
    }
}
