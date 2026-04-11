import java.util.*;
class Booking {
    String user;
    boolean vip;
    Booking(String user, boolean vip) {
        this.user = user;
        this.vip = vip;
    }
    public String toString() {
        return user + (vip ? " (VIP)" : "");
    }
}
public class EventTicketReservationSystem {
    public static void main(String[] args) {
        List<Booking> all = new ArrayList<>();
        Set<String> users = new HashSet<>();
        Queue<Booking> q = new LinkedList<>();
        PriorityQueue<Booking> pq = new PriorityQueue<>(
            (a, b) -> Boolean.compare(b.vip, a.vip)
        );
        if (users.add("U1")) q.add(new Booking("U1", false));
        if (users.add("U2")) q.add(new Booking("U2", true));
        if (users.add("U3")) q.add(new Booking("U3", false));
        if (users.add("U2")) q.add(new Booking("U2", true));
        pq.addAll(q);
        System.out.println("Processing Bookings:");
        while (!pq.isEmpty()) {
            Booking b = pq.poll();
            System.out.println("Confirmed: " + b);
            all.add(b);
        }
        System.out.println("All Bookings:");
        for (Booking b : all) System.out.println(b);
    }
}