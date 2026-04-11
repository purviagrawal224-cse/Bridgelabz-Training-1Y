import java.util.*;
abstract class JobRole {
    abstract String role();
}
class SoftwareEngineer extends JobRole {
    String role() {
        return "Software Engineer";
    }
}
class DataScientist extends JobRole {
    String role() {
        return "Data Scientist";
    }
}
class ProductManager extends JobRole {
    String role() {
        return "Product Manager";
    }
}
class Resume<T extends JobRole> {
    T job;
    Resume(T job) {
        this.job = job;
    }
    void process() {
        System.out.println("Processing for: " + job.role());
    }
}
public class ResumeScreeningSystem {
    static <T extends JobRole> void screenResume(T job) {
        Resume<T> r = new Resume<>(job);
        r.process();
    }
    static void pipeline(List<? extends JobRole> list) {
        for (JobRole j : list) System.out.println("Pipeline: " + j.role());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<JobRole> list = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int ch = sc.nextInt();
            if (ch == 1) list.add(new SoftwareEngineer());
            else if (ch == 2) list.add(new DataScientist());
            else if (ch == 3) list.add(new ProductManager());
        }
        for (JobRole j : list) screenResume(j);
        pipeline(list);
    }
}
