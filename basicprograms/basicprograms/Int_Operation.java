import java.util.Scanner;

public class Int_Operation {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter value of a : ");
        int a = in.nextInt();

        System.out.print("Enter value of b : ");
        int b = in.nextInt();

        System.out.print("Enter value of c : ");
        int c = in.nextInt();
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;


        System.out.print("The results of Int Operations are ");
        System.out.print(result1 + ", " + result2 + ", " + result3 + ", and " + result4);
    }
}
