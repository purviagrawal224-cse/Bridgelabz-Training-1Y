import java.util.Scanner;
public class WrapperPrimitive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double x = sc.nextDouble();
        double a = x;
        int b = (int) a;
        System.out.println(a);
        System.out.println(b);
    }
}