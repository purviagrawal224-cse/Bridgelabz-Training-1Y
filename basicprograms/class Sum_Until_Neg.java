import java.util.Scanner;

public class Sum_Until_Neg {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double sum = 0.0;
        while (true){
            System.out.print("Enter a number (0 or negative to stop) : ");
            double n = sc.nextDouble();
            if(n<=0) break;
            sum += n;
        }
        System.out.println("Total sum = "+sum);
    }
}
