import java.util.Scanner;

public class Smallest_Of_Three {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int n2 = sc.nextInt();
        System.out.print("Enter third number : ");
        int n3 = sc.nextInt();
        if(n1 < n2 && n1 < n3) System.out.println("First number is smallest");
        else System.out.println("No first number is not smallest");
    }
}
