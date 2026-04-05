import java.util.Scanner;
interface UnitConverter {
    static double kmToMiles(double km) {
        return km * 0.621371;
    }
    static double kgToLbs(double kg) {
        return kg * 2.20462;
    }
}
public class ConversionTool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1 Km to Miles, 2 Kg to Lbs: ");
        int c = sc.nextInt();
        System.out.print("Enter value: ");
        double v = sc.nextDouble();
        if (c == 1) System.out.println("Result: " + UnitConverter.kmToMiles(v));
        else if (c == 2) System.out.println("Result: " + UnitConverter.kgToLbs(v));
        else System.out.println("Invalid choice");
    }
}