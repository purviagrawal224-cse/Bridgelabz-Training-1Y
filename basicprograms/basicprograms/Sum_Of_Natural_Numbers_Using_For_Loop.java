import java.util.Scanner;

public class Sum_Of_Natural_Numbers_Using_For_Loop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number : ");
        int n = sc.nextInt();
        if(n<=0) System.out.println("Not a natural number");
        else {
            int sum = 0;
            for(int i = 0; i<=n; i++){
                sum += i;
            }
            int sum_Formula = n*(n+1)/2;
            System.out.println("Sum using for loop is "+sum);
            System.out.println("Sum using formula is "+sum_Formula);
            if(sum==sum_Formula) System.out.println("Result is correct");
            else System.out.println("Result is not correct");
        }
    }
}
