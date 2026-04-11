import java.util.*;
class RideRequest {
    String user;
    int priority;
    RideRequest(String user, int priority) {
        this.user = user;
        this.priority = priority;
    }
    public String toString() {
        return user + " (P:" + priority + ")";
    }
}
class Driver {
    String name;
    Driver(String name) {
        this.name = name;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driver)) return false;
        Driver d = (Driver) o;
        return name.equals(d.name);
    }
    public int hashCode() {
        return Objects.hash(name);
    }
    public String toString() {
        return name;
    }
}
class Ride {
    String user;
    String driver;
    Ride(String user, String driver) {
        this.user = user;
        this.driver = driver;
    }
    public String toString() {
        return user + " -> " + driver;
    }
}
public class RideSharingDispatchSystem {
    public static void main(String[] args) {
        Queue<RideRequest> q = new LinkedList<>();
        PriorityQueue<RideRequest> pq = new PriorityQueue<>(
            (a, b) -> b.priority - a.priority
        );
        Set<Driver> drivers = new HashSet<>();
        drivers.add(new Driver("D1"));
        drivers.add(new Driver("D2"));

        List<Ride> history = new ArrayList<>();
        q.add(new RideRequest("U1", 2));
        q.add(new RideRequest("U2", 5));
        q.add(new RideRequest("U3", 1));
        pq.addAll(q);
        while (!pq.isEmpty() && !drivers.isEmpty()) {
            RideRequest r = pq.poll();
            Driver d = drivers.iterator().next();
            drivers.remove(d);
            System.out.println("Assigned: " + r + " -> " + d);
            history.add(new Ride(r.user, d.name));
        }
        System.out.println("Completed Rides:");
        for (Ride r : history) System.out.println(r);
    }
}