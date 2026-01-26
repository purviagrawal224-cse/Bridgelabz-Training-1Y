import java.util.Scanner;

public class Table_Of_Number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        for(int i=6; i<=9; i++) System.out.println(n+" x "+i+" = "+(n*i));
    }
}
