import java.util.*;
abstract class Stu {
    private int id;
    private String nm;
    private double m1, m2, m3;
    Stu(int id, String nm, double m1, double m2, double m3) {
        this.id = id;
        this.nm = nm;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    int getId() { return id; }
    String getNm() { return nm; }
    double getTot() {
        return m1 + m2 + m3;
    }
    double getAvg() {
        return getTot() / 3.0;
    }
    abstract String calRes();
    void show() {
        System.out.println("Id   : " + id);
        System.out.println("Name : " + nm);
        System.out.println("Total: " + getTot());
        System.out.println("Avg  : " + getAvg());
    }
}
interface Sch {
    String calGrade(double avg);
}
class UG extends Stu implements Sch {
    UG(int id, String nm, double m1, double m2, double m3) {
        super(id, nm, m1, m2, m3);
    }
    public String calRes() {
        return getAvg() >= 40 ? "Pass" : "Fail";
    }
    public String calGrade(double avg) {
        if (avg >= 75) return "A";
        else if (avg >= 60) return "B";
        else if (avg >= 50) return "C";
        else return "D";
    }
}
class PG extends Stu {
    PG(int id, String nm, double m1, double m2, double m3) {
        super(id, nm, m1, m2, m3);
    }
    public String calRes() {
        return getAvg() >= 50 ? "Pass" : "Fail";
    }
}
public class Student_Result_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Stu> list = new ArrayList<>();
        System.out.print("Enter total students : ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("\n1.UG  2.PG");
            System.out.print("Choose type : ");
            int ch = sc.nextInt();
            sc.nextLine();
            System.out.print("Id : ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name : ");
            String nm = sc.nextLine();
            System.out.print("Mark1 : ");
            double m1 = sc.nextDouble();
            System.out.print("Mark2 : ");
            double m2 = sc.nextDouble();
            System.out.print("Mark3 : ");
            double m3 = sc.nextDouble();
            sc.nextLine();
            Stu s;
            if (ch == 1) s = new UG(id, nm, m1, m2, m3);
            else s = new PG(id, nm, m1, m2, m3);
            list.add(s);
        }
        System.out.println("\n--- Result Details ---");
        for (Stu s : list) {
            s.show();
            System.out.println("Result : " + s.calRes());
            if (s instanceof Sch) System.out.println("Grade  : " + ((Sch) s).calGrade(s.getAvg()));
            System.out.println("---");
        }
        sc.close();
    }
}
