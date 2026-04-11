import java.util.*;
class Patient implements Comparable<Patient> {
    String name;
    int severity;
    Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
    public int compareTo(Patient o) {
        return o.severity - this.severity;
    }
    public String toString() {
        return name + " (" + severity + ")";
    }
}
public class HospitalTriageSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Patient> pq = new PriorityQueue<>();
        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            int sev = sc.nextInt();
            sc.nextLine();
            pq.add(new Patient(name, sev));
        }
        System.out.println("Treatment Order:");
        while (!pq.isEmpty()) System.out.println(pq.remove());
    }
}
