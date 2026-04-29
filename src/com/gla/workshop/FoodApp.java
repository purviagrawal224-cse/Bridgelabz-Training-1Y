import java.util.Scanner;
class Order {
    int id;
    double amt;
    static double dc = 40;
    Order(int id, double amt) {
        this.id = id;
        this.amt = amt;
    }
    double calculateBill() {
        return amt + dc;
    }
}
class RegularOrder extends Order {

    RegularOrder(int id, double amt) {
        super(id, amt);
    }
    double calculateBill() {
        return amt + dc;
    }
}
class PremiumOrder extends Order {

    PremiumOrder(int id, double amt) {
        super(id, amt);
    }
    double calculateBill() {
        return (amt - (amt * 0.20)) + dc;
    }
}
public class FoodApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter type (1-Regular, 2-Premium): ");
        int ch = sc.nextInt();
        System.out.print("Enter order id: ");
        int id = sc.nextInt();
        System.out.print("Enter base amount: ");
        double amt = sc.nextDouble();
        Order o = null;
        if (ch == 1) o = new RegularOrder(id, amt);
        else if (ch == 2) o = new PremiumOrder(id, amt);
        else {
            System.out.println("Invalid choice");
            return;
        }
        System.out.println("Delivery Charge: " + Order.dc);
        System.out.println("Total Bill: " + o.calculateBill());
        sc.close();
    }
}