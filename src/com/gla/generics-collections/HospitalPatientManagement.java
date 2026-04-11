import java.util.*;
class Patient {
    String id;
    String name;
    Patient(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient)) return false;
        Patient p = (Patient) o;
        return id.equals(p.id);
    }
    public int hashCode() {
        return Objects.hash(id);
    }
    public String toString() {
        return id + " " + name;
    }
}
public class HospitalPatientManagement {
    public static void main(String[] args) {
        Set<Patient> admitted = new HashSet<>();
        Queue<Patient> q = new LinkedList<>();
        Stack<Patient> discharged = new Stack<>();
        List<Patient> history = new ArrayList<>();
        Patient p1 = new Patient("P1", "John");
        Patient p2 = new Patient("P2", "Alice");
        Patient p3 = new Patient("P3", "Bob");
        if (admitted.add(p1)) q.add(p1);
        if (admitted.add(p2)) q.add(p2);
        if (admitted.add(p3)) q.add(p3);
        System.out.println("Treatment:");
        while (!q.isEmpty()) {
            Patient p = q.remove();
            System.out.println("Treated: " + p);
            admitted.remove(p);
            discharged.push(p);
            history.add(p);
        }
        System.out.println("Re-admission:");
        if (!discharged.isEmpty()) {
            Patient p = discharged.pop();
            System.out.println("Re-admitted: " + p);
            admitted.add(p);
            q.add(p);
        }
        System.out.println("Patient History:");
        for (Patient p : history) System.out.println(p);
    }
}