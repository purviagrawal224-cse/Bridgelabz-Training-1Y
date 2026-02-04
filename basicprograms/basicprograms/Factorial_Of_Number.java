import java.util.Scanner;

public class Factorial_Of_Number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter positive number : ");
        int n = sc.nextInt();
        if(n<0) System.out.println("Factorial is not defined for negative numbers");
        else {
            int fact = 1;
            int i = 1;
            while(i<=n){
                fact *= i;
                i++;
            }
            System.out.println("Factorial of "+n+" using while loop is "+fact);
        }
    }
}
