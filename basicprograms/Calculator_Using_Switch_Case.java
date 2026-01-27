import java.util.Scanner;

public class Calculator_Using_Switch_Case {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        double n1 = sc.nextDouble();
        System.out.print("Enter second number : ");
        double n2 = sc.nextDouble();
        System.out.print("Enter operator : ");
        String op = sc.next();
            switch (op){
                case "+":
                    System.out.println("Result = "+(n1+n2));
                    break;

                case"-":
                    System.out.println("Result = "+(n1-n2));
                    break;
                case "*":
                    System.out.println("Result = "+(n1*n2));
                    break;
                case "/":
                    if(n2!=0) System.out.println("Result = "+(n1/n2));
                    else System.out.println("Division by zero is not possible");
                    break;
                default:
                    System.out.println("Invalid Operator");
            }
    }
}
