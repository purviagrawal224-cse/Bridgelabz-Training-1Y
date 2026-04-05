import java.util.Scanner;
interface Rentable {
    void rent();
    void returnVehicle();
}
class Car implements Rentable {
    public void rent() {
        System.out.println("Car rented");
    }
    public void returnVehicle() {
        System.out.println("Car returned");
    }
}
class Bike implements Rentable {
    public void rent() {
        System.out.println("Bike rented");
    }
    public void returnVehicle() {
        System.out.println("Bike returned");
    }
}
class Bus implements Rentable {
    public void rent() {
        System.out.println("Bus rented");
    }
    public void returnVehicle() {
        System.out.println("Bus returned");
    }
}
public class RentalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1 Car, 2 Bike, 3 Bus: ");
        int t = sc.nextInt();
        System.out.print("1 Rent, 2 Return: ");
        int c = sc.nextInt();
        Rentable r = null;
        if (t == 1) r = new Car();
        else if (t == 2) r = new Bike();
        else if (t == 3) r = new Bus();
        else {
            System.out.println("Invalid vehicle");
            return;
        }
        if (c == 1) r.rent();
        else if (c == 2) r.returnVehicle();
        else System.out.println("Invalid action");
    }
}