import java.util.Scanner;

public class Double_Operation {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a : ");
        double a = in.nextDouble();
        System.out.print("Enter b : ");
        double b = in.nextDouble();
        System.out.print("Enter c : ");
        double c = in.nextDouble();
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;
        System.out.print("The results of Double Operations are ");
        System.out.print(result1 + ", " + result2 + ", " + result3 + ", and " + result4);

    }
}
