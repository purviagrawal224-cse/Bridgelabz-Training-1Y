import java.util.Scanner;
public class Temp_Converter {
    static double fahrenheit_To_Celsius(double f) {
        return (f-32)*5/9;
    }
    static double celsius_To_Fahrenheit(double c) {
        return (c*9/5)+32;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        int choice = sc.nextInt();
        if (choice == 1) {
            double f = sc.nextDouble();
            System.out.println("Celsius : " + fahrenheit_To_Celsius(f));
        }
        else if (choice == 2) {
            double c = sc.nextDouble();
            System.out.println("Fahrenheit : " + celsius_To_Fahrenheit(c));
        }
        else System.out.println("Invalid choice");
        sc.close();
    }
}