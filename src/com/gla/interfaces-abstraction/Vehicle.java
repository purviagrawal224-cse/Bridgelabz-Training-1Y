import java.util.Scanner;
interface Move {
    void start();
    void stop();
}
class Car implements Move {
    public void start() {
        System.out.println("Car started");
    }
    public void stop() {
        System.out.println("Car stopped");
    }
}
public class Vehicle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car c = new Car();
        System.out.print("Enter 1 to start, 2 to stop: ");
        int n = sc.nextInt();
        if(n == 1) c.start();
        else if (n == 2) c.stop();
        else System.out.println("Invalid choice");
    }
}