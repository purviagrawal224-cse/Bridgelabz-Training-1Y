import java.util.*;
abstract class Prod {
    private int id;
    private String nm;
    private double pr;
    Prod(int id, String nm, double pr) {
        this.id = id;
        this.nm = nm;
        this.pr = pr;
    }
    int getId() { return id; }
    String getNm() { return nm; }
    double getPr() { return pr; }
    void setPr(double pr) { this.pr = pr; }
    abstract double calDis();
    void show() {
        System.out.println("Id   : " + id);
        System.out.println("Name : " + nm);
        System.out.println("Price: " + pr);
    }
}
interface Tax {
    double calTax();
    String taxInfo();
}
class Elec extends Prod implements Tax {
    Elec(int id, String nm, double pr) {
        super(id, nm, pr);
    }
    public double calDis() {
        return getPr() * 0.10;
    }
    public double calTax() {
        return getPr() * 0.18;
    }
    public String taxInfo() {
        return "GST 18%";
    }
}

class Cloth extends Prod implements Tax {
    Cloth(int id, String nm, double pr) {
        super(id, nm, pr);
    }
    public double calDis() {
        return getPr() * 0.15;
    }
    public double calTax() {
        return getPr() * 0.05;
    }
    public String taxInfo() {
        return "GST 5%";
    }
}
class Groc extends Prod {
    Groc(int id, String nm, double pr) {
        super(id, nm, pr);
    }

    public double calDis() {
        return getPr() * 0.05;
    }
}
public class E_Com_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Prod> list = new ArrayList<>();
        System.out.print("Enter total products : ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("\n1.Electronics  2.Clothing  3.Grocery");
            System.out.print("Choose type : ");
            int ch = sc.nextInt();
            sc.nextLine();
            System.out.print("Id : ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name : ");
            String nm = sc.nextLine();
            System.out.print("Price : ");
            double pr = sc.nextDouble();
            sc.nextLine();
            Prod p;
            if (ch == 1) p = new Elec(id, nm, pr);
            else if (ch == 2) p = new Cloth(id, nm, pr);
            else p = new Groc(id, nm, pr);
            list.add(p);
        }
        System.out.println("\n--- Final Bill ---");
        for (Prod p : list) {
            p.show();
            double dis = p.calDis();
            double tax = 0;
            if (p instanceof Tax) {
                tax = ((Tax) p).calTax();
                System.out.println("Tax : " + ((Tax) p).taxInfo());
            }
            double finalPr = p.getPr() + tax - dis;
            System.out.println("Discount : "+dis);
            System.out.println("Final Price : "+finalPr);
            System.out.println("------");
        }
        sc.close();
    }
}
