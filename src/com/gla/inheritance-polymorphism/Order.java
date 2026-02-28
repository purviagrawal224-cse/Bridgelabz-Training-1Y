import java.util.*;
class Order {
    int id;
    String od;
    Order(int id, String od) {
        this.id = id;
        this.od = od;
    }
    String getOrderStatus() {
        return "Order Placed";
    }
    void display() {
        System.out.println("Order ID : " + id);
        System.out.println("Order Date : " + od);
        System.out.println("Status : " + getOrderStatus());
    }
}
class ShippedOrder extends Order {
    String tn;
    ShippedOrder(int id, String od, String tn) {
        super(id, od);
        this.tn = tn;
    }
    String getOrderStatus() {
        return "Order Shipped";
    }
    void display() {
        super.display();
        System.out.println("Tracking Number : " + tn);
    }
}
class DeliveredOrder extends ShippedOrder {
    String dd;
    DeliveredOrder(int id, String od, String tn, String dd) {
        super(id, od, tn);
        this.dd = dd;
    }
    String getOrderStatus() {
        return "Order Delivered";
    }
    void display() {
        super.display();
        System.out.println("Delivery Date : " +dd);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter order id : ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter order date : ");
        String od = sc.nextLine();
        System.out.print("Enter tracking number : ");
        String tn = sc.nextLine();
        System.out.print("Enter delivery date : ");
        String dd = sc.nextLine();
        DeliveredOrder ob = new DeliveredOrder(id, od, tn, dd);
        System.out.println();
        ob.display();
        sc.close();
    }
}
