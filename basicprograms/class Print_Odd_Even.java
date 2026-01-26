import java.util.Scanner;

public class Print_Odd_Even {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        if(n<=0) System.out.println("Please enter a natural number");
        else {
            for(int i=1; i<=n; i++){
                if(i%2==0) System.out.println(i+" is even");
                else System.out.println(i+" is odd");
            }
        }
    }
}
