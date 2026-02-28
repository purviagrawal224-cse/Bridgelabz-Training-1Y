import java.util.*;
interface Refuelable {
    void refuel();
}
abstract class Vehicle_2 {
    int s;
    String m;
    Vehicle_2(int s, String m) {
        this.s = s;
        this.m = m;
    }
    void disp() {
        System.out.println("Model : " + m);
        System.out.println("Max Speed : " + s + " km/h");
    }
    abstract void show();
}
class ElectricVehicle extends Vehicle_2 {
    ElectricVehicle(int s, String m) {
        super(s, m);
    }
    void charge() {
        System.out.println("Charging vehicle...");
    }
    void show() {
        System.out.println("Type : Electric");
        disp();
        charge();
        System.out.println();
    }
}
class PetrolVehicle extends Vehicle_2 implements Refuelable {
    PetrolVehicle(int s, String m) {
        super(s, m);
    }
    public void refuel() {
        System.out.println("Refueling vehicle...");
    }
    void show() {
        System.out.println("Type : Petrol");
        disp();
        refuel();
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        sc.nextLine();
        Vehicle_2[] a = new Vehicle_2[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Type (electric/petrol) : ");
            String t = sc.nextLine().toLowerCase();
            System.out.print("Model : ");
            String m = sc.nextLine();
            System.out.print("Speed : ");
            int s = sc.nextInt();
            sc.nextLine();
            if(t.equals("electric")) a[i] = new ElectricVehicle(s, m);
            else a[i] = new PetrolVehicle(s, m);
        }
        System.out.println();
        for(int i = 0; i < n; i++)
            a[i].show();
        sc.close();
    }
}
