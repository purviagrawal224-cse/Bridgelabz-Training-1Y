import java.util.*;
class Device {
    int id;
    String st;
    Device(int id, String st) {
        this.id = id;
        this.st = st;
    }
    void displayStatus() {
        System.out.println("Device ID: " + id);
        System.out.println("Status: " + st);
    }
}
class Thermostat extends Device {
    double ts;
    Thermostat(int id, String st, double ts) {
        super(id, st);
        this.ts = ts;
    }
    void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + ts + "°C");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter device id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter status (on/off): ");
        String st = sc.nextLine();
        System.out.print("Enter temperature setting: ");
        double ts = sc.nextDouble();
        Thermostat ob = new Thermostat(id, st, ts);
        System.out.println();
        ob.displayStatus();
        sc.close();
    }
}
