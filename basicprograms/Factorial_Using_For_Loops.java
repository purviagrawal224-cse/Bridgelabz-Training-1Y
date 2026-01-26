import java.util.Scanner;

public class Factorial_Using_For_Loops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter positive number : ");
        int n = sc.nextInt();
        if(n<0) System.out.println("Factorial is not defined for negative numbers");
        else {
            int fact = 1;
            for(int i=1; i<=n; i++){
                fact *= i;
            }
            System.out.println("Factorial of "+n+" using for loop is "+fact);
        }
    }
}
