import java.util.Scanner;

public class Fizz_Buzz_Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        if(n<=0){
            System.out.println("Invalid input. Please enter a positive number");
            return;
        }
        String[] res = new String[n+1];
        for(int i=0; i<=n; i++){
            if(i==0) res[i] = "O";
            else if(i%3==0 && i%5==0) res[i] = "FizzBuzz";
            else if(i%3==0) res[i] = "Fizz";
            else if(i%5==0) res[i] = "Buzz";
            else res[i] = String.valueOf(i);
        }
        for(int i=0; i<=n; i++) System.out.println("Position "+i+" is "+res[i]);
        sc.close();
    }
}