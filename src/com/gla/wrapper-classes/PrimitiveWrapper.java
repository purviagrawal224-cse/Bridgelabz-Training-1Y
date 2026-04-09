import java.util.Scanner;
public class PrimitiveWrapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Integer y = Integer.valueOf(x);
        System.out.println(x);
        System.out.println(y);
    }
}