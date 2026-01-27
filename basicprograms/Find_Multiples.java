import java.util.Scanner;

public class Find_Multiples {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        if(n<=0 || n>=100) System.out.println("Please enter positive and less than 100");
        else {
            System.out.println("Multiples of "+n+" below 100 : ");
            for(int i=100; i>=1; i--){
                if(i%n==0) System.out.println(i);
            }
        }
    }
}
