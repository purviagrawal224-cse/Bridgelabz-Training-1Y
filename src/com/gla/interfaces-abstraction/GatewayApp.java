import java.util.Scanner;
interface PaymentProcessor {
    void pay(double a);
    default void refund(double a) {
        System.out.println("Refund of " + a + " initiated");
    }
}
class UPI implements PaymentProcessor {
    @Override
    public void pay(double a) {
        System.out.println("Paid " + a + " via UPI");
    }
}
class Card implements PaymentProcessor {
    @Override
    public void pay(double a) {
        System.out.println("Paid " + a + " via Card");
    }
}
public class GatewayApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1 UPI, 2 Card: ");
        int t = sc.nextInt();
        System.out.print("Enter amount: ");
        double a = sc.nextDouble();
        System.out.print("1 Pay, 2 Refund: ");
        int c = sc.nextInt();
        PaymentProcessor p = null;
        if (t == 1) p = new UPI();
        else if (t == 2) p = new Card();
        else {
            System.out.println("Invalid provider");
            return;
        }
        if (c == 1) p.pay(a);
        else if (c == 2) p.refund(a);
        else System.out.println("Invalid action");
    }
}