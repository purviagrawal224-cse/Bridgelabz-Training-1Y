import java.util.Scanner;
public class Quadratic {
    public static double[] findRoots(double a, double b, double c) {
        double d = Math.pow(b, 2) - 4 * a * c;
        if(d > 0) {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            return new double[]{r1, r2};
        }
        else if(d == 0) {
            double r = -b / (2 * a);
            return new double[]{r};
        }
        else return new double[]{};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a : ");
        double a = sc.nextDouble();
        if(a == 0) {
            System.out.println("Not a quadratic equation");
            return;
        }
        System.out.print("Enter value of b : ");
        double b = sc.nextDouble();
        System.out.print("Enter value of c : ");
        double c = sc.nextDouble();
        double[] roots = findRoots(a, b, c);
        if(roots.length == 2) {
            System.out.println("Root 1 : " + roots[0]);
            System.out.println("Root 2 : " + roots[1]);
        }
        else if(roots.length == 1) System.out.println("Root : " + roots[0]);
        else System.out.println("Roots are imaginary");
        sc.close();
    }
}
