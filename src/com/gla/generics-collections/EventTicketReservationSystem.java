import java.util.*;
class Booking implements Comparable<Booking> {
    String user;
    boolean vip;
    Booking(String user, boolean vip) {
        this.user = user;
        this.vip = vip;
    }
    public int compareTo(Booking o) {
        if (this.vip == o.vip) return 0;
        return this.vip ? -1 : 1;
    }
    public String toString() {
        return user + (vip ? " (VIP)" : "");
    }
}
public class EventTicketReservationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Booking> all = new ArrayList<>();
        Set<String> users = new HashSet<>();
        Queue<Booking> normalQ = new LinkedList<>();
        PriorityQueue<Booking> vipQ = new PriorityQueue<>();
        System.out.print("Enter number of users: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String u = sc.nextLine();
            if (!users.add(u)) System.out.println("Duplicate user ignored: " + u);
        }
        System.out.print("Enter number of bookings: ");
        int m = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < m; i++) {
            String user = sc.nextLine();
            boolean vip = sc.nextBoolean();
            sc.nextLine();
            Booking b = new Booking(user, vip);
            if (vip) vipQ.add(b);
            else normalQ.add(b);
        }
        System.out.println("Processing Bookings:");
        while (!vipQ.isEmpty()) {
            Booking b = vipQ.remove();
            System.out.println("Confirmed (VIP): " + b);
            all.add(b);
        }
        while (!normalQ.isEmpty()) {
            Booking b = normalQ.remove();
            System.out.println("Confirmed: " + b);
            all.add(b);
        }
        System.out.println("All Bookings:");
        for (Booking b : all) System.out.println(b);
    }
}
