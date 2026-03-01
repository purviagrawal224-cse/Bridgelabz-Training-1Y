import java.util.Scanner;
public class Item_Inv {
    int c;
    String n;
    double p;
    void input(Scanner sc) {
        System.out.print("Enter Item Code: ");
        c = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Item Name: ");
        n = sc.nextLine();
        System.out.print("Enter Price: ");
        p = sc.nextDouble();
    }
    double total(int q) {
        return p * q;
    }
    void display(int q) {
        System.out.println("\nItem Details");
        System.out.println("Code : " +c);
        System.out.println("Name : " +n);
        System.out.println("Price : " +p);
        System.out.println("Total Cost : " + total(q));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item_Inv i = new Item_Inv();
        i.input(sc);
        System.out.print("Enter Quantity: ");
        int q = sc.nextInt();
        i.display(q);
        sc.close();
    }
}
