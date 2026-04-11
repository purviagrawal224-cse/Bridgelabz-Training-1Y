import java.util.*;
class Patient {
    String name;
    Patient(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient)) return false;
        Patient p = (Patient) o;
        return name.equals(p.name);
    }
    public int hashCode() {
        return Objects.hash(name);
    }
}
public class HospitalPatientManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Patient> admitted = new HashSet<>();
        Queue<Patient> queue = new LinkedList<>();
        Stack<Patient> discharged = new Stack<>();
        List<Patient> history = new ArrayList<>();
        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            Patient p = new Patient(name);
            if (admitted.add(p)) {
                queue.add(p);
                history.add(p);
            }
            else System.out.println("Duplicate patient ignored: " + name);
        }
        System.out.println("Treating Patients:");
        while (!queue.isEmpty()) {
            Patient p = queue.remove();
            System.out.println("Treated: " + p);
            discharged.push(p);
            admitted.remove(p);
        }
        System.out.println("Re-admit last discharged patient? (yes/no)");
        String ans = sc.nextLine();
        if (ans.equalsIgnoreCase("yes") && !discharged.isEmpty()) {
            Patient p = discharged.pop();
            admitted.add(p);
            queue.add(p);
            System.out.println("Re-admitted: " + p);
        }
        System.out.println("Patient History:");
        for (Patient p : history) System.out.println(p);
    }
}
