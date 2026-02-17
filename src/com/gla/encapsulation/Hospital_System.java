import java.util.*;
abstract class Pat {
    private int id;
    private String nm;
    private double fee;
    Pat(int id, String nm, double fee) {
        this.id = id;
        this.nm = nm;
        this.fee = fee;
    }
    int getId() { return id; }
    String getNm() { return nm; }
    double getFee() { return fee; }
    abstract double calBill(int d);
    void show() {
        System.out.println("Id   : " + id);
        System.out.println("Name : " + nm);
        System.out.println("Fee  : " + fee);
    }
}
interface Ins {
    double calIns(double amt);
}
class InPat extends Pat implements Ins {
    InPat(int id, String nm, double fee) {
        super(id, nm, fee);
    }
    public double calBill(int d) {
        return getFee() * d;
    }
    public double calIns(double amt) {
        return amt * 0.20;
    }
}
class OutPat extends Pat {
    OutPat(int id, String nm, double fee) {
        super(id, nm, fee);
    }
    public double calBill(int d) {
        return getFee();
    }
}
public class Hospital_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pat> list = new ArrayList<>();
        System.out.print("Enter total patients : ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("\n1.InPatient  2.OutPatient");
            System.out.print("Choose type : ");
            int ch = sc.nextInt();
            sc.nextLine();
            System.out.print("Id : ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name : ");
            String nm = sc.nextLine();
            System.out.print("Fee : ");
            double fee = sc.nextDouble();
            sc.nextLine();
            Pat p;
            if (ch == 1) p = new InPat(id, nm, fee);
            else p = new OutPat(id, nm, fee);
            list.add(p);
        }
        System.out.println("\n--- Patient Details ---");
        for (Pat p : list) {
            p.show();
            System.out.print("Days : ");
            int d = sc.nextInt();
            double bill = p.calBill(d);
            double ins = 0;
            if (p instanceof Ins) {
                ins = ((Ins) p).calIns(bill);
                System.out.println("Insurance : " + ins);
            }
            System.out.println("Total Bill : " + (bill - ins));
            System.out.println("---");
        }
        sc.close();
    }
}
