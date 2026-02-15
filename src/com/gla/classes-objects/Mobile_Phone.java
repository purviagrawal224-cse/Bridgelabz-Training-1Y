import java.util.Scanner;
public class Mobile_Phone {
    String b;
    String m;
    double p;
    void input(Scanner sc) {
        System.out.print("Enter Brand: ");
        b = sc.nextLine();
        System.out.print("Enter Model: ");
        m = sc.nextLine();
        System.out.print("Enter Price: ");
        p = sc.nextDouble();
    }
    void display() {
        System.out.println("\nMobile Details");
        System.out.println("Brand: " + b);
        System.out.println("Model: " + m);
        System.out.println("Price: " + p);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mobile_Phone mp = new Mobile_Phone();
        mp.input(sc);
        mp.display();
        sc.close();
    }
}
