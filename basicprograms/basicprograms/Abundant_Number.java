import java.util.Scanner;

public class Abundant_Number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        if(n<=0){
            System.out.println("Please enter a positive number");
            return;
        }
        int sum = 0;
        for(int i=1; i<n; i++){
            if(n%i==0) sum += i;
        }
        if(sum>n) System.out.println("Abundant number");
        else System.out.println("Not an abundant number");
    }
}
