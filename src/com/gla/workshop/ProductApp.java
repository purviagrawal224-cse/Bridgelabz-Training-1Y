import java.util.Scanner;
class Product {
    int id;
    String name;
    Product(int id, String name) {
        this.id = id;
        this.name = name;
    }
    boolean isMatch(String key) {
        return name.toLowerCase().contains(key.toLowerCase());
    }
}
class ElectronicProduct extends Product {
    String brand;
    ElectronicProduct(int id, String name, String brand) {
        super(id, name);
        this.brand = brand;
    }
    boolean isMatch(String key) {
        return name.toLowerCase().contains(key.toLowerCase()) ||
               brand.toLowerCase().contains(key.toLowerCase());
    }
}
public class ProductApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter type (1-Product, 2-Electronic): ");
        int ch = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter product id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter product name: ");
        String name = sc.nextLine();
        Product p = null;
        if (ch == 1) p = new Product(id, name);
	else if (ch == 2) {
            System.out.print("Enter brand: ");
            String brand = sc.nextLine();
            p = new ElectronicProduct(id, name, brand);
        }
	else {
            System.out.println("Invalid choice");
            return;
        }
        System.out.print("Enter search keyword: ");
        String key = sc.nextLine();
        if (p.isMatch(key)) System.out.println("Product Matched");
        else System.out.println("No Match Found");
        sc.close();
    }
}