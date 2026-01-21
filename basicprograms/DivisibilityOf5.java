import java.util.Scanner;

public class DivisibilityOf5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        if (x % 5 == 0) System.out.print("The number is divisible by 5");
        else System.out.print("The number is not divisible by 5");
    }
}
