import java.util.Scanner;

public class Find_Multiples_Using_While_Loop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        if(n<=0 || n>=100) System.out.println("Please enter positive and less than 100");
        else {
            int i = 100;
            System.out.println("Multiples of "+n+" below 100 : ");
            while(i>=1){
                if(i%n==0) System.out.println(i);
                i--;
            }
        }
    }
}
