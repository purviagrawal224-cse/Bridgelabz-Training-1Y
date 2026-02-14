import java.util.Scanner;
public class Athlete_Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first side : ");
        double s1 = sc.nextDouble();
        System.out.print("Enter second side : ");
        double s2 = sc.nextDouble();
        System.out.print("Enter third side : ");
        double s3 = sc.nextDouble();
        double rounds = calculate(s1, s2, s3);
        System.out.println("The athlete needs to complete "+rounds+" rounds to finish 5 km");
    }
    public static double calculate(double a, double b, double c) {
        double perimeter = a+b+c;
        return 5000/perimeter;
    }
}