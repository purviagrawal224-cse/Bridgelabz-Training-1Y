import java.util.*;
class Vehicle {
    int ms;
    String ft;
    Vehicle(int ms, String ft) {
        this.ms = ms;
        this.ft = ft;
    }
    void displayInfo() {
        System.out.println("Max Speed: " + ms);
        System.out.println("Fuel Type: " + ft);
    }
}
class Car extends Vehicle {
    int sc;
    Car(int ms, String ft, int sc) {
        super(ms, ft);
        this.sc = sc;
    }
    void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity: " + sc);
        System.out.println();
    }
}
class Truck extends Vehicle {
    double lc;
    Truck(int ms, String ft, double lc) {
        super(ms, ft);
        this.lc = lc;
    }
    void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity : " + lc + " tons");
        System.out.println();
    }
}
class Motorcycle extends Vehicle {
    boolean abs;
    Motorcycle(int ms, String ft, boolean abs) {
        super(ms, ft);
        this.abs = abs;
    }
    void displayInfo() {
        super.displayInfo();
        System.out.println("ABS Available : " + abs);
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vehicles : ");
        int n = sc.nextInt();
        sc.nextLine();
        Vehicle[] arr = new Vehicle[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Enter type(car/truck/motorcycle): ");
            String t = sc.nextLine().toLowerCase();
            System.out.print("Enter max speed : ");
            int ms = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter fuel type : ");
            String ft = sc.nextLine();
            if(t.equals("car")) {
                System.out.print("Enter seat capacity : ");
                int sca = sc.nextInt();
                sc.nextLine();
                arr[i] = new Car(ms, ft, sca);
            }
            else if(t.equals("truck")) {
                System.out.print("Enter load capacity (tons) : ");
                double lc = sc.nextDouble();
                sc.nextLine();
                arr[i] = new Truck(ms, ft, lc);
            }
            else {
                System.out.print("ABS available (true/false): ");
                boolean abs = sc.nextBoolean();
                sc.nextLine();
                arr[i] = new Motorcycle(ms, ft, abs);
            }
        }
        System.out.println();
        for(int i = 0; i < n; i++) {
            arr[i].displayInfo();
        }
        sc.close();
    }
}
