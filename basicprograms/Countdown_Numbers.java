import java.util.Scanner;

public class Countdown_Numbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter countdown start number : ");
        int n = sc.nextInt();
        while (n>=1){
            System.out.println(n);
            n--;
        }
        System.out.println("Launch");
    }
}
