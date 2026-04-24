import java.util.Scanner;

public class Reverse_Order_Using_Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int num = Math.abs(n);
        if(num==0){
            System.out.println("Reverse number is 0");
            sc.close();
            return;
        }
        int[] digits = new int[10];
        int idx = 0;
        while(num!=0 && idx<10){
            digits[idx] = num%10;
            num /= 10;
            idx++;
        }
        long rev = 0;
        for(int i=0; i<idx; i++) rev = rev*10+digits[i];
        if(n<0) rev = -rev;
        System.out.println("Reversed number is "+rev);
        sc.close();
    }
}