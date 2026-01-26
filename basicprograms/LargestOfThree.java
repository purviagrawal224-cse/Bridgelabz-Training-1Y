import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter number2 : ");
        int num2 = sc.nextInt();
        System.out.print("Enter number3 : ");
        int num3 = sc.nextInt();
        if(num1 >= num2 && num1 >= num3) System.out.println("First number is largest");
        else if(num2 >= num1 && num2 >= num3) System.out.println("Second number is largest");
        else System.out.println("Third number is largest");
        sc.close();
    }
}
