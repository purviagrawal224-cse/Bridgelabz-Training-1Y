import java.util.Scanner;

public class Countdown_Using_For_Loop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter countdown start number : ");
        int n = sc.nextInt();
        for(int i = n; i>=1; i--){
            System.out.println(i);
        }
        System.out.println("Launch");
    }
}
