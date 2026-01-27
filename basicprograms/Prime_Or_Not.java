import java.util.Scanner;

public class Prime_Or_Not {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        boolean is_prime = true;
        if(n<=1) is_prime = false;
        else{
            for(int i=2; i<n; i++){
                if(n%i==0){
                    is_prime = false;
                    break;
                }
            }
        }
        if(is_prime==true) System.out.println(n+" is a prime number");
        else System.out.println(n+" is not a prime number");
    }
}
