import java.util.Scanner;

public class Factors_Of_Number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        if(n<=0) System.out.println("Please enter positive number");
        else {
            System.out.println("Factors of "+n+" are : ");
            for(int i=1; i<=n; i++){
                if(n%i==0) System.out.println(i);
            }
        }
    }
}
