import java.util.Scanner;
class Product implements Cloneable {
    int id;
    String n;
    double p;
    Product(int id, String n, double p) {
        this.id = id;
        this.n = n;
        this.p = p;
    }
    public Product clone() {
        try {
            return (Product) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
    void show() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + n);
        System.out.println("Price: " + p);
    }
}
public class PrototypeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id: ");
        int i = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        String n = sc.nextLine();
        System.out.print("Enter price: ");
        double p = sc.nextDouble();
        Product p1 = new Product(i, n, p);
        Product p2 = p1.clone();
        System.out.println("\nOriginal Object:");
        p1.show();
        System.out.println("\nCloned Object:");
        p2.show();
    }
}