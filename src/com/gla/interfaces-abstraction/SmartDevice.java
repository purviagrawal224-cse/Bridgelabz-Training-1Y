import java.util.Scanner;
interface Device {
    void turnOn();
    void turnOff();
}
class Light implements Device {
    public void turnOn() {
        System.out.println("Light ON");
    }
    public void turnOff() {
        System.out.println("Light OFF");
    }
}
class AC implements Device {
    public void turnOn() {
        System.out.println("AC ON");
    }
    public void turnOff() {
        System.out.println("AC OFF");
    }
}
class TV implements Device {
    public void turnOn() {
        System.out.println("TV ON");
    }
    public void turnOff() {
        System.out.println("TV OFF");
    }
}
public class SmartDevice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1 Light, 2 AC, 3 TV: ");
        int t = sc.nextInt();
        System.out.print("1 On, 2 Off: ");
        int c = sc.nextInt();
        Device d = null;
        if (t == 1) d = new Light();
        else if (t == 2) d = new AC();
        else if (t == 3) d = new TV();
        else {
            System.out.println("Invalid device");
            return;
        }
        if (c == 1) d.turnOn();
        else if (c == 2) d.turnOff();
        else System.out.println("Invalid action");
    }
}