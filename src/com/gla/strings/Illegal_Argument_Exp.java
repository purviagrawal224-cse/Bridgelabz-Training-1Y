package StringApi;

import java.util.Scanner;

public class Illegal_Argument_Exp {
    static void generate_Exp(String str) {
        System.out.println(str.substring(3, 2));
    }
    static void handleException(String str) {
        try {
            System.out.println(str.substring(3, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        try {
            generate_Exp(str);
        } catch (Exception e) {
            System.out.println("Exception generated");
        }
        handleException(str);
    }
}
