import java.util.Scanner;

public class Armstrong_Or_Not {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int orignal_number = n;
        int sum = 0;
        while(n>0){
            int digit = n%10;
            sum += (digit*digit*digit);
            n /= 10;
        }
        if(sum==orignal_number) System.out.println(orignal_number+" is an armstrong number");
        else System.out.println(orignal_number+" is not an armstrong number");
    }
}
