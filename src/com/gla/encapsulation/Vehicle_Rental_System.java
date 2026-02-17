import java.util.*;
abstract class Veh {
    private int id;
    private String md;
    private double rt;
    Veh(int id, String md, double rt) {
        this.id = id;
        this.md = md;
        this.rt = rt;
    }
    int getId() { return id; }
    String getMd() { return md; }
    double getRt() { return rt; }
    abstract double calRent(int d);
    void show() {
        System.out.println("Id   : " + id);
        System.out.println("Model: " + md);
        System.out.println("Rate : " + rt);
    }
}
interface Ins {
    double calIns(int d);
}
class Car extends Veh implements Ins {
    Car(int id, String md, double rt) {
        super(id, md, rt);
    }
    public double calRent(int d) {
        return getRt() * d;
    }
    public double calIns(int d) {
        return 500 * d;
    }
}
class Bike extends Veh {
    Bike(int id, String md, double rt) {
        super(id, md, rt);
    }
    public double calRent(int d) {
        return getRt() * d;
    }
}
public class Vehicle_Rental_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Veh> list = new ArrayList<>();
        System.out.print("Enter total vehicle : ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("\n1.Car  2.Bike");
            System.out.print("Choose type : ");
            int ch = sc.nextInt();
            sc.nextLine();
            System.out.print("Id : ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Model : ");
            String md = sc.nextLine();
            System.out.print("Rate per day : ");
            double rt = sc.nextDouble();
            sc.nextLine();
            Veh v;
            if (ch == 1) v = new Car(id, md, rt);
	    else v = new Bike(id, md, rt);
            list.add(v);
        }
        System.out.println("\n--- Rental Details ---");
        for (Veh v : list) {
            v.show();
            System.out.print("Days : ");
            int d = sc.nextInt();
            double rent = v.calRent(d);
            double ins = 0;
            if (v instanceof Ins) {
                ins = ((Ins) v).calIns(d);
                System.out.println("Insurance : " + ins);
            }
            System.out.println("Total Rent : "+(rent + ins));
            System.out.println("---");
        }
        sc.close();
    }
}
