import java.util.*;
class Vehicle {
    String n;
    Vehicle(String n) {
        this.n = n;
    }
    void show() {
        System.out.println(n);
    }
}
class Truck extends Vehicle {
    Truck(String n) {
        super(n);
    }
}
class Bike extends Vehicle {
    Bike(String n) {
        super(n);
    }
}
class FleetManager<T extends Vehicle> {
    ArrayList<T> l = new ArrayList<>();
    void addVehicle(T v) {
        l.add(v);
    }
    void showFleet() {
        for (T i : l) {
            i.show();
        }
    }
}
public class GenericFleetManager {
    public static void main(String[] args) {
        FleetManager<Truck> t = new FleetManager<>();
        t.addVehicle(new Truck("Truck1"));
        t.addVehicle(new Truck("Truck2"));
        System.out.println("Truck Fleet:");
        t.showFleet();
        FleetManager<Bike> b = new FleetManager<>();
        b.addVehicle(new Bike("Bike1"));
        b.addVehicle(new Bike("Bike2"));
        System.out.println("Bike Fleet:");
        b.showFleet();
    }
}