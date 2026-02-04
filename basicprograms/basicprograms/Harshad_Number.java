import java.util.Scanner;

public class Harshad_Number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        while(temp!=0){
            int digit = temp%10;
            sum += digit;
            temp /=10;
        }
        if(n%sum==0) System.out.println("Harshad number");
        else System.out.println("Not a harshad number");
    }
}
