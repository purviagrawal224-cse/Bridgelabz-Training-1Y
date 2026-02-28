import java.util.*;
abstract class Emp {
    private int id;
    private String nm;
    private double bs;
    Emp(int id, String nm, double bs) {
        this.id = id;
        this.nm = nm;
        this.bs = bs;
    }
    int getId() { return id; }
    String getNm() { return nm; }
    double getBs() { return bs; }
    void setBs(double bs) { this.bs = bs; }
    abstract double calSal();
    void show() {
        System.out.println("Id   : " + id);
        System.out.println("Name : " + nm);
    }
}
interface Dept {
    void setDept(String d);
    String getDept();
}
class FullEmp extends Emp implements Dept {
    private String d;
    private int h;
    FullEmp(int id, String nm, double bs, int h) {
        super(id, nm, bs);
        this.h = h;
    }
    public double calSal() {
        return getBs() + (h * 200);
    }
    public void setDept(String d) { this.d = d; }
    public String getDept() { return d; }
}
class PartEmp extends Emp implements Dept {
    private String d;
    private int h;
    PartEmp(int id, String nm, int h) {
        super(id, nm, 0);
        this.h = h;
    }
    public double calSal() {
        return h * 300;
    }
    public void setDept(String d) { this.d = d; }
    public String getDept() { return d; }
}
public class Emp_Manage_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Emp> list = new ArrayList<>();
        System.out.print("Enter total employee : ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("\n1.Full  2.Part");
            System.out.print("Choose type : ");
            int ch = sc.nextInt();
            sc.nextLine();
            System.out.print("Id : ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name : ");
            String nm = sc.nextLine();
            System.out.print("Dept : ");
            String d = sc.nextLine();
            System.out.print("Working hours : ");
            int h = sc.nextInt();
            sc.nextLine();
            Emp e;
            if (ch == 1) {
                System.out.print("Base salary : ");
                double bs = sc.nextDouble();
                sc.nextLine();
                e = new FullEmp(id, nm, bs, h);
	    }
            else e = new PartEmp(id, nm, h);
            ((Dept) e).setDept(d);
            list.add(e);
        }
        System.out.println("\n---Employee Details---");
        for (Emp e : list) {
            e.show();
            System.out.println("Dept   : "+((Dept) e).getDept());
            System.out.println("Salary : "+e.calSal());
            System.out.println("---");
        }
        sc.close();
    }
}
