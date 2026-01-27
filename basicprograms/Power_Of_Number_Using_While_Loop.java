import java.util.Scanner;

public class Power_Of_Number_Using_While_Loop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base : ");
        int a = sc.nextInt();
        System.out.print("Enter exponent : ");
        int b = sc.nextInt();
        int result = 1;
        int i = 0;
        while(i<b){
            result *=a;
            i++;
        }
        System.out.println(a+" raised to the power "+b+" is "+result);
    }
}
