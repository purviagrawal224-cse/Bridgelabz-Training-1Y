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

        System.out.print("Enter total employee
