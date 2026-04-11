import java.util.*;
class Parcel {
    String id;
    int priority;
    Parcel(String id, int priority) {
        this.id = id;
        this.priority = priority;
    }
    public String toString() {
        return id + " (P:" + priority + ")";
    }
}
public class CourierDeliveryRoutingSystem {
    public static void main(String[] args) {
        PriorityQueue<Parcel> pq = new PriorityQueue<>(
            (a, b) -> b.priority - a.priority
        );
        Queue<Parcel> q = new LinkedList<>();
        Set<String> ids = new HashSet<>();
        List<Parcel> completed = new ArrayList<>();
        Parcel p1 = new Parcel("P1", 5);
        Parcel p2 = new Parcel("P2", 2);
        Parcel p3 = new Parcel("P3", 4);
        Parcel p4 = new Parcel("P1", 3);
        if (ids.add(p1.id)) pq.add(p1);
        if (ids.add(p2.id)) q.add(p2);
        if (ids.add(p3.id)) pq.add(p3);
        if (ids.add(p4.id)) pq.add(p4);
        System.out.println("Assigning Deliveries:");
        while (!pq.isEmpty() || !q.isEmpty()) {
            Parcel p;
            if (!pq.isEmpty()) p = pq.poll();
            else p = q.poll();
            System.out.println("Delivered: " + p);
            completed.add(p);
        }
        System.out.println("Completed Deliveries:");
        for (Parcel p : completed) {
            System.out.println(p);
        }
    }
}