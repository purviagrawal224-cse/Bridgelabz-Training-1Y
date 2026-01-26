import java.util.Scanner;

public class Factors_Of_Number_Using_While_Loop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        if(n<=0) System.out.println("Please enter positive number");
        else {
            int i = 1;
            System.out.println("Factors of "+n+" are : ");
            while(i<=n){
                if(n%i==0) System.out.println(i);
                i++;
            }
        }
    }
}
