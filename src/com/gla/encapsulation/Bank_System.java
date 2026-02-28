import java.util.*;
abstract class Acc {
    private int ac;
    private String nm;
    private double bal;
    Acc(int ac, String nm, double bal) {
        this.ac = ac;
        this.nm = nm;
        this.bal = bal;
    }
    int getAc() { return ac; }
    String getNm() { return nm; }
    double getBal() { return bal; }
    void setBal(double bal) { this.bal = bal; }
    abstract void calInt();
    void show() {
        System.out.println("Acc No : " + ac);
        System.out.println("Name   : " + nm);
        System.out.println("Bal    : " + bal);
    }
}
interface Loan {
    double calLoan(double amt);
}
class Sav extends Acc {
    Sav(int ac, String nm, double bal) {
        super(ac, nm, bal);
    }
    public void calInt() {
        double i = getBal() * 0.04;
        setBal(getBal() + i);
    }
}
class Cur extends Acc implements Loan {
    Cur(int ac, String nm, double bal) {
        super(ac, nm, bal);
    }
    public void calInt() {
        // No interest for current account
    }
    public double calLoan(double amt) {
        return amt * 0.10;
    }
}
public class Bank_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Acc> list = new ArrayList<>();
        System.out.print("Enter total accounts : ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("\n1.Saving  2.Current");
            System.out.print("Choose type : ");
            int ch = sc.nextInt();
            sc.nextLine();
            System.out.print("Acc No : ");
            int ac = sc.nextInt();
            sc.nextLine();
            System.out.print("Name : ");
            String nm = sc.nextLine();
            System.out.print("Balance : ");
            double bal = sc.nextDouble();
            sc.nextLine();
            Acc a;
            if (ch == 1) a = new Sav(ac, nm, bal);
            else a = new Cur(ac, nm, bal);
            list.add(a);
        }
        System.out.println("\n---Account Details---");
        for (Acc a : list) {
            a.calInt();
            a.show();
            if (a instanceof Loan) {
                System.out.print("Enter loan amt : ");
                double amt = sc.nextDouble();
                double l = ((Loan) a).calLoan(amt);
                System.out.println("Loan Interest : " + l);
            }
            System.out.println("---");
        }

        sc.close();
    }
}
