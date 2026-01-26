import java.util.Scanner;

public class Sum_Of_Natural_Numbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number : ");
        int n = sc.nextInt();
        if(n<=0) System.out.println("Not a natural number");
        else {
            int sum = 0;
            int i = 0;
            while (i<=n){
                sum += i;
                i++;
            }
            int sum_Formula = n*(n+1)/2;
            System.out.println("Sum using while loop is "+sum);
            System.out.println("Sum using formula is "+sum_Formula);
            if(sum==sum_Formula) System.out.println("Result is correct");
            else System.out.println("Result is not correct");
        }
    }
}
