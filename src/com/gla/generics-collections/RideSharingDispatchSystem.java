import java.util.*;
class Driver {
    String name;
    Driver(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
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
}
class RideRequest implements Comparable<RideRequest> {
    String user;
    int priority;
    RideRequest(String user, int priority) {
        this.user = user;
        this.priority = priority;
    }
    public int compareTo(RideRequest o) {
        return o.priority - this.priority;
    }
    public String toString() {
        return user + " (P=" + priority + ")";
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
        Scanner sc = new Scanner(System.in);
        Set<Driver> drivers = new HashSet<>();
        Queue<RideRequest> normalQ = new LinkedList<>();
        PriorityQueue<RideRequest> pq = new PriorityQueue<>();
        List<Ride> completed = new ArrayList<>();
        System.out.print("Enter number of drivers: ");
        int d = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < d; i++) {
            String name = sc.nextLine();
            drivers.add(new Driver(name));
        }
        System.out.print("Enter number of ride requests: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String user = sc.nextLine();
            int p = sc.nextInt();
            sc.nextLine();
            RideRequest r = new RideRequest(user, p);
            if (p > 5) pq.add(r);
            else normalQ.add(r);
        }
        System.out.println("Assigning Rides:");
        Iterator<Driver> it = drivers.iterator();
        while (!pq.isEmpty() && it.hasNext()) {
            RideRequest r = pq.remove();
            Driver dr = it.next();
            System.out.println("Assigned (Priority): " + r + " -> " + dr);
            completed.add(new Ride(r.user, dr.name));
        }
        while (!normalQ.isEmpty() && it.hasNext()) {
            RideRequest r = normalQ.remove();
            Driver dr = it.next();
            System.out.println("Assigned: " + r + " -> " + dr);
            completed.add(new Ride(r.user, dr.name));
        }
        System.out.println("Completed Rides:");
        for (Ride r : completed) System.out.println(r);
    }
}
