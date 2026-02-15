import java.util.Scanner;
public class Cart_Item {
    String n;
    double p;
    int q;
    void input(Scanner sc) {
        System.out.print("Enter Item Name: ");
        n = sc.nextLine();
        System.out.print("Enter Price: ");
        p = sc.nextDouble();
        System.out.print("Enter Quantity: ");
        q = sc.nextInt();
    }
    void add(int x) {
        q += x;
    }
    void remove(int x) {
        if (x <= q) q -= x;
        else System.out.println("Not enough quantity");
    }
    void display() {
        System.out.println("\nCart Details");
        System.out.println("Item: " + n);
        System.out.println("Price: " + p);
        System.out.println("Quantity: " + q);
        System.out.println("Total Cost: " + (p * q));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cart_Item c = new Cart_Item();
        c.input(sc);
        System.out.print("Add Quantity: ");
        c.add(sc.nextInt());
        System.out.print("Remove Quantity: ");
        c.remove(sc.nextInt());
        c.display();
        sc.close();
    }
}
