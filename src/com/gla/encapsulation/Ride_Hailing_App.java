import java.util.*;
abstract class Vehicle {
    private int id;
    private String driver;
    private double rate;
    Vehicle(int id, String driver, double rate) {
        this.id = id;
        this.driver = driver;
        this.rate = rate;
    }
    public int getId() { return id; }
    public String getDriver() { return driver; }
    public double getRate() { return rate; }
    abstract double calculateFare(double dist);
    public void getVehicleDetails() {
        System.out.println("Vehicle Id : " + id);
        System.out.println("Driver     : " + driver);
        System.out.println("Rate/Km    : " + rate);
    }
}
interface GPS {
    String getCurrentLocation();
    void updateLocation(String loc);
}
class Car extends Vehicle implements GPS {
    private String loc;
    Car(int id, String driver, double rate) {
        super(id, driver, rate);
    }
    public double calculateFare(double dist) {
        return getRate() * dist + 100;
    }
    public String getCurrentLocation() {
        return loc;
    }
    public void updateLocation(String loc) {
        this.loc = loc;
    }
}
class Bike extends Vehicle implements GPS {
    private String loc;
    Bike(int id, String driver, double rate) {
        super(id, driver, rate);
    }
    public double calculateFare(double dist) {
        return getRate() * dist + 20;
    }
    public String getCurrentLocation() {
        return loc;
    }
    public void updateLocation(String loc) {
        this.loc = loc;
    }
}
class Auto extends Vehicle implements GPS {
    private String loc;
    Auto(int id, String driver, double rate) {
        super(id, driver, rate);
    }
    public double calculateFare(double dist) {
        return getRate() * dist + 50;
    }
    public String getCurrentLocation() {
        return loc;
    }
    public void updateLocation(String loc) {
        this.loc = loc;
    }
}
public class Ride_Hailing_App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Vehicle> list = new ArrayList<>();
        System.out.print("Enter total vehicles : ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++) {
            System.out.println("\n1.Car  2.Bike  3.Auto");
            int ch = sc.nextInt();
            sc.nextLine();
            System.out.print("Vehicle Id : ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Driver Name : ");
            String driver = sc.nextLine();
            System.out.print("Rate per Km : ");
            double rate = sc.nextDouble();
            sc.nextLine();
            Vehicle v;
            if (ch == 1) v = new Car(id, driver, rate);
            else if(ch == 2) v = new Bike(id, driver, rate);
            else v = new Auto(id, driver, rate);
            list.add(v);
        }
        System.out.print("\nEnter distance (km) : ");
        double dist = sc.nextDouble();
        System.out.println("\n--- Fare Details ---");
        for (Vehicle v : list) {
            v.getVehicleDetails();
            System.out.println("Fare : " + v.calculateFare(dist));
            if (v instanceof GPS) {
                GPS g = (GPS) v;
                g.updateLocation("City Center");
                System.out.println("Location : " + g.getCurrentLocation());
            }
            System.out.println("---");
        }
        sc.close();
    }
}
