import java.util.*;
class Student implements Comparable<Student> {
    String name;
    int marks;
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    public String toString() {
        return name + " " + marks;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student s = (Student) o;
        return name.equals(s.name);
    }
    public int hashCode() {
        return Objects.hash(name);
    }
    public int compareTo(Student o) {
        if (o.marks != this.marks) return o.marks - this.marks;
        return this.name.compareTo(o.name);
    }
}
public class CollegeAdmissionSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> applicants = new ArrayList<>();
        Set<Student> shortlisted = new HashSet<>();
        Queue<Student> interviewQ = new LinkedList<>();
        TreeSet<Student> merit = new TreeSet<>();
        System.out.print("Enter number of applicants: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            int marks = sc.nextInt();
            sc.nextLine();
            applicants.add(new Student(name, marks));
        }
        System.out.print("Enter cutoff marks: ");
        int cutoff = sc.nextInt();
        sc.nextLine();
        for (Student s : applicants) {
            if (s.marks >= cutoff) {
                shortlisted.add(s);
                interviewQ.add(s);
            }
        }
        System.out.println("Interview Process:");
        while (!interviewQ.isEmpty()) {
            Student s = interviewQ.remove();
            System.out.println("Select " + s.name + "? (yes/no)");
            String ans = sc.nextLine();
            if (ans.equalsIgnoreCase("yes")) merit.add(s);
        }
        System.out.println("Final Merit List:");
        for (Student s : merit) System.out.println(s);
    }
}
