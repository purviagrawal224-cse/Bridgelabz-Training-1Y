import java.util.Scanner;
public class Unit_Convertor3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Fahrenheit: ");
        double f = sc.nextDouble();
        System.out.println("Celsius: " + Unit_Convertor3.convertFarhenheitToCelsius(f));
        System.out.print("Enter Celsius: ");
        double c = sc.nextDouble();
        System.out.println("Fahrenheit: " + Unit_Convertor3.convertCelsiusToFarhenheit(c));
        System.out.print("Enter Pounds: ");
        double p = sc.nextDouble();
        System.out.println("Kilograms: " + Unit_Convertor3.convertPoundsToKilograms(p));
        System.out.print("Enter Kilograms: ");
        double k = sc.nextDouble();
        System.out.println("Pounds: " + Unit_Convertor3.convertKilogramsToPounds(k));
        System.out.print("Enter Gallons: ");
        double g = sc.nextDouble();
        System.out.println("Liters: " + Unit_Convertor3.convertGallonsToLiters(g));
        System.out.print("Enter Liters: ");
        double l = sc.nextDouble();
        System.out.println("Gallons: " + Unit_Convertor3.convertLitersToGallons(l));
        sc.close();
    }
    public static double convertFarhenheitToCelsius(double farhenheit) {
        return (farhenheit - 32) * 5 / 9;
    }
    public static double convertCelsiusToFarhenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }
}
