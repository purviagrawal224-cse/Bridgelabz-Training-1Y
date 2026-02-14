import java.util.Scanner;
public class Distance_Line {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1 y1 : ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.println("Enter x2 y2 : ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double distance = findDistance(x1, y1, x2, y2);
        System.out.println("Distance = " + distance);
        double[] line = findLine(x1, y1, x2, y2);
        if(line != null) {
            System.out.println("Slope = " + line[0]);
            System.out.println("Intercept = " + line[1]);
            System.out.println("Equation: y = " + line[0] + "x + " + line[1]);
        }
        sc.close();
    }
    public static double findDistance(double x1,double y1,double x2,double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    public static double[] findLine(double x1,double y1,double x2,double y2) {
        if(x1 == x2) {
            System.out.println("Equation: x = " + x1);
            return null;
        }
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m, b};
    }
}
