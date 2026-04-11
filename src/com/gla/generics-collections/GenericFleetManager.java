import java.util.*;
abstract class Vehicle {
    abstract String type();
}
class Truck extends Vehicle {
    String type() {
        return "Truck";
    }
}
class Bike extends Vehicle {
    String type() {
        return "Bike";
    }
}
class FleetManager<T extends Vehicle> {
    List<T> list = new ArrayList<>();
    void addVehicle(T v) {
        list.add(v);
    }
    void showFleet() {
        for (T v : list) System.out.println(v.type());
    }
}
public class GenericFleetManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FleetManager<Truck> trucks = new FleetManager<>();
        FleetManager<Bike> bikes = new FleetManager<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int ch = sc.nextInt();
            if (ch == 1) trucks.addVehicle(new Truck());
            else if (ch == 2) bikes.addVehicle(new Bike());
        }
        trucks.showFleet();
        bikes.showFleet();
    }
}
