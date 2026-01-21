import java.util.Scanner;

public class Basic_Calculator_By_User {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number : ");
        double number1 = input.nextDouble();
        System.out.print("Enter second number : ");
        double number2 = input.nextDouble();

        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        System.out.print("The addition, subtraction, multiplication and division value of 2 numbers " + number1);
        System.out.print(" and " + number2 + " is " + addition);
        System.out.print(", " + subtraction + ", " + multiplication + ", and " + division);
    }
}
