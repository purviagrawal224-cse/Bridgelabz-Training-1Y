import java.util.*;
class Patient {
    String n;
    int sev;
    Patient(String n, int sev) {
        this.n = n;
        this.sev = sev;
    }
}
public class HospitalTriageSystem {
    public static void main(String[] args) {
        PriorityQueue<Patient> pq = new PriorityQueue<>(
            (a, b) -> b.sev - a.sev
        );
        pq.add(new Patient("John", 3));
        pq.add(new Patient("Alice", 5));
        pq.add(new Patient("Bob", 2));
        while (!pq.isEmpty()) {
            System.out.println(pq.poll().n);
        }
    }
}