import java.util.Scanner;

public class Total_Price_By_User {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter unit price: ");
        double price = in.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = in.nextInt();

        double total = price * quantity;

        System.out.print("The total purchase price is INR " + total);
        System.out.print(" if the quantity " + quantity);
        System.out.print(" and unit price is INR " + price);
    }
}
