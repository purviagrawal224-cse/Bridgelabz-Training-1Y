import java.util.*;
class Student implements Comparable<Student> {
    String name;
    int marks;
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
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
    public String toString() {
        return name + " " + marks;
    }
}
public class CollegeAdmissionSystem {
    public static void main(String[] args) {
        List<Student> all = new ArrayList<>();
        all.add(new Student("A", 85));
        all.add(new Student("B", 70));
        all.add(new Student("C", 90));
        all.add(new Student("A", 85));
        Set<Student> shortlisted = new HashSet<>();
        for (Student s : all) {
            if (s.marks >= 75) shortlisted.add(s);
        }
        Queue<Student> q = new LinkedList<>(shortlisted);
        TreeSet<Student> merit = new TreeSet<>();
        System.out.println("Interview Process:");
        while (!q.isEmpty()) {
            Student s = q.remove();
            System.out.println("Interviewed: " + s);
            merit.add(s);
        }
        System.out.println("Final Merit List:");
        for (Student s : merit) System.out.println(s);
    }
}