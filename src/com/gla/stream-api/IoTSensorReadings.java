package Lambda;
import java.util.*;
public class IoTSensorReadings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> l = new ArrayList<>();
        System.out.println("Enter number of readings:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter reading:");
            double x = sc.nextDouble();
            l.add(x);
        }
        System.out.println("Enter threshold:");
        double t = sc.nextDouble();
        l.stream()
         .filter(x -> x > t)
         .forEach(x -> System.out.println(x));
        sc.close();
    }
}