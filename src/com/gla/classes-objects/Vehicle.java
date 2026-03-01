import java.util.Scanner;
public class Vehicle {
    String o;
    String t;
    static double fee = 1000;
    Vehicle(String o, String t) {
        this.o = o;
        this.t = t;
    }
    void displayVehicleDetails() {
        System.out.println("Owner: " + o);
        System.out.println("Type: " + t);
        System.out.println("Registration Fee: " + fee);
    }
    static void updateRegistrationFee(double f) {
        fee = f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Owner Name: ");
        String o = sc.nextLine();
        System.out.print("Enter Vehicle Type: ");
        String t = sc.nextLine();
        Vehicle v = new Vehicle(o, t);
        v.displayVehicleDetails();
        System.out.print("Enter New Registration Fee: ");
        double nf = sc.nextDouble();
        Vehicle.updateRegistrationFee(nf);
        v.displayVehicleDetails();
        sc.close();
    }
}
