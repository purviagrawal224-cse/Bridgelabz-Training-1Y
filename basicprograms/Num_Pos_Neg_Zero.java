import java.util.Scanner;

public class Num_Pos_Neg_Zero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        if(n>0) System.out.println("Positive");
        else if(n<0) System.out.println("Negative");
        else System.out.println("Zero");
    }
}
