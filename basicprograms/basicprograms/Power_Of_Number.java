import java.util.Scanner;

public class Power_Of_Number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base : ");
        int a = sc.nextInt();
        System.out.print("Enter exponent : ");
        int b = sc.nextInt();
        int result = 1;
        for(int i=1; i<=b; i++){
            result *= a;
        }
        System.out.println(a+" raised to the power "+b+" is "+result);
    }
}
