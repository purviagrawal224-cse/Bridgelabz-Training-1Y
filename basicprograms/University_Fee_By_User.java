import java.util.Scanner;

public class University_Fee_By_User {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter fee : ");
        double fee =in.nextDouble();
        System.out.print("Enter discount percent : ");
        double discount_Percent = in.nextDouble();


        double discount = (fee * discount_Percent) / 100;
        double final_Fee = fee - discount;

        System.out.println("The discount amount is INR " + discount+" and final discounted fee is INR " + final_Fee);
        System.out.println();
    }
}
