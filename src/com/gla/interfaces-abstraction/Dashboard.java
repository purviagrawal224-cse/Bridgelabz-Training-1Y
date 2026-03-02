import java.util.Scanner;
interface Vehicle {
    void displaySpeed(int s);
    default void displayBattery(int b) {
        System.out.println("Battery info not available");
    }
}
class Car implements Vehicle {
    @Override
    public void displaySpeed(int s) {
        System.out.println("Speed: " + s + " km/h");
    }
}
class ElectricCar implements Vehicle {
    @Override
    public void displaySpeed(int s) {
        System.out.println("Speed: " + s + " km/h");
    }
    @Override
    public void displayBattery(int b) {
        System.out.println("Battery: " + b + "%");
    }
}
public class Dashboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1 Car, 2 ElectricCar: ");
        int t = sc.nextInt();
        System.out.print("Enter speed: ");
        int s = sc.nextInt();
        System.out.print("Enter battery %: ");
        int b = sc.nextInt();
        Vehicle v = null;
        if (t == 1) v = new Car();
        else if (t == 2) v = new ElectricCar();
        else {
            System.out.println("Invalid vehicle");
            return;
        }
        v.displaySpeed(s);
        v.displayBattery(b);
    }
}