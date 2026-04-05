import java.util.Scanner;
interface Payment {
    void pay(double amt);
}
class UPI implements Payment {
    public void pay(double amt) {
        System.out.println("Paid " + amt + " using UPI");
    }
}
class CreditCard implements Payment {
    public void pay(double amt) {
        System.out.println("Paid " + amt + " using Credit Card");
    }
}
class Wallet implements Payment {
    public void pay(double amt) {
        System.out.println("Paid " + amt + " using Wallet");
    }
}
public class DigitalPayment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount: ");
        double a = sc.nextDouble();
        System.out.print("1 UPI, 2 CreditCard, 3 Wallet: ");
        int t = sc.nextInt();
        Payment p = null;
        if (t == 1) p = new UPI();
        else if (t == 2) p = new CreditCard();
        else if (t == 3) p = new Wallet();
        else {
            System.out.println("Invalid option");
            return;
        }
        p.pay(a);
    }
}