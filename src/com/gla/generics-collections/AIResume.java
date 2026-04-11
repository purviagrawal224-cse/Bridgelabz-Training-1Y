import java.util.*;
abstract class JobRole {
    String n;
    JobRole(String n) {
        this.n = n;
    }
    void show() {
        System.out.println(n);
    }
}
class SoftwareEngineer extends JobRole {
    SoftwareEngineer(String n) {
        super(n);
    }
}
class DataScientist extends JobRole {
    DataScientist(String n) {
        super(n);
    }
}
class ProductManager extends JobRole {
    ProductManager(String n) {
        super(n);
    }
}
class Resume<T extends JobRole> {
    ArrayList<T> l = new ArrayList<>();
    void addResume(T x) {
        l.add(x);
    }
    void displayResumes() {
        for (T i : l) {
            i.show();
        }
    }
}
public class AIResume {
    static <T extends JobRole> void processResume(T r) {
        r.show();
    }
    static void screening(List<? extends JobRole> l) {
        for (JobRole x : l) {
            x.show();
        }
    }
    public static void main(String[] args) {
        Resume<SoftwareEngineer> se = new Resume<>();
        se.addResume(new SoftwareEngineer("SE Candidate 1"));
        se.addResume(new SoftwareEngineer("SE Candidate 2"));
        Resume<DataScientist> ds = new Resume<>();
        ds.addResume(new DataScientist("DS Candidate 1"));
        ds.addResume(new DataScientist("DS Candidate 2"));
        Resume<ProductManager> pm = new Resume<>();
        pm.addResume(new ProductManager("PM Candidate 1"));
        pm.addResume(new ProductManager("PM Candidate 2"));
        System.out.println("Software Engineers:");
        se.displayResumes();
        System.out.println("Data Scientists:");
        ds.displayResumes();
        System.out.println("Product Managers:");
        pm.displayResumes();
        System.out.println("Processing:");
        processResume(new SoftwareEngineer("SE Candidate 3"));
        System.out.println("Screening Pipeline:");
        screening(Arrays.asList(
                new SoftwareEngineer("SE Candidate X"),
                new DataScientist("DS Candidate X"),
                new ProductManager("PM Candidate X")
        ));
    }
}