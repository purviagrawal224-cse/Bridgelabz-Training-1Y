import java.util.Scanner;

public class Total_Price {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter unit price : ");
        double price = in.nextDouble();

        System.out.print("Enter quantity : ");
        int quantity = in.nextInt();

        double totalPrice = price * quantity;

        System.out.print("The total purchase price is INR " + totalPrice);
        System.out.print(" if the quantity " + quantity);
        System.out.print(" and unit price is INR " + price);
    }
}
