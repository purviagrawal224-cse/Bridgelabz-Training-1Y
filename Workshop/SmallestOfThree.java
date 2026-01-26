import java.util.Scanner;

public class SmallestOfThree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();
        if (number1 < number2 && number1 < number3) {
            System.out.println("First number is the smallest");
        } else {
            System.out.println("First number is NOT the smallest");
        }
    }
}
