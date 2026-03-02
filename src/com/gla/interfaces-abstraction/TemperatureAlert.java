import java.util.Scanner;
import java.util.function.Predicate;
public class TemperatureAlert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double t = sc.nextDouble();
        System.out.print("Enter threshold: ");
        double th = sc.nextDouble();
        Predicate<Double> alert = x -> x > th;
        if (alert.test(t)) System.out.println("Alert: Temperature crossed threshold");
        else System.out.println("Temperature normal");
    }
}