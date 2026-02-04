import java.util.Scanner;

public class Digit_Frequency {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        long n = sc.nextLong();
        n = Math.abs(n);
        int[] freq = new int[10];
        if(n==0) freq[0]=1;
        while(n>0){
            int digit = (int)(n%10);
            freq[digit]++;
            n/=10;
        }
        System.out.println("\nDigit Frequency : ");
        for(int i=0; i<10; i++){
            if(freq[i]>0) System.out.println("Digit "+i+" occurs "+freq[i]+" times");
        }
        sc.close();
    }
}