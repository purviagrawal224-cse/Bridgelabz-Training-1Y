import java.util.Scanner;
public class Product {
    String n;
    double p;
    static int total = 0;
    Product(String n, double p) {
        this.n = n;
        this.p = p;
        total++;
    }
    void displayProductDetails() {
        System.out.println("Name: " + n);
        System.out.println("Price: " + p);
    }
    static void displayTotalProducts() {
        System.out.println("Total Products: " + total);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of products: ");
        int x = sc.nextInt();
        sc.nextLine();
        Product[] arr = new Product[x];
        for (int i = 0; i < x; i++) {
            System.out.print("Enter Product Name: ");
            String n = sc.nextLine();
            System.out.print("Enter Price: ");
            double p = sc.nextDouble();
            sc.nextLine();
            arr[i] = new Product(n, p);
        }
        for (Product pr : arr) pr.displayProductDetails();
        Product.displayTotalProducts();
        sc.close();
    }
}
