import java.util.Scanner;
public class Wind_Chill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        double windSpeed = sc.nextDouble();
        double res = calWindChill(temp, windSpeed);
        System.out.println("Wind Chill Temperature : " + res);
        sc.close();
    }
    public static double calWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215*temperature+(0.4275*temperature - 35.75)*Math.pow(windSpeed, 0.16);
    }
}