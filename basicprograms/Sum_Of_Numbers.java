import java.util.Scanner;

public class Sum_Of_Numbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double sum = 0.0;
        System.out.print("Enter number : ");
        double n = sc.nextDouble();
        while(n!=0){
            sum += n;
            System.out.print("Enter a number (0 to stop) : ");
            n = sc.nextDouble();
        }
        System.out.println("Total sum = "+ sum);
    }
}
