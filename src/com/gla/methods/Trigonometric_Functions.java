import java.util.Scanner;
public class Trigonometric_Functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ang = sc.nextDouble();
        double[] res = calc(ang);
        System.out.println("Sin : "+res[0]);
        System.out.println("Cos : "+res[1]);
        System.out.println("Tan : "+res[2]);
        sc.close();
    }
    public static double[] calc(double angle) {
        double rad = Math.toRadians(angle);
        double sin = Math.sin(rad);
        double cos = Math.cos(rad);
        double tan = Math.tan(rad);
        return new double[]{sin, cos, tan};
    }
}