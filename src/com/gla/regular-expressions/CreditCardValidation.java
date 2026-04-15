package Regex;
import java.util.*;
import java.util.regex.*;
public class CreditCardValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter card number:");
        String s = sc.nextLine();
        String r = "^(4\\d{15}|5\\d{15})$";
        if (Pattern.matches(r, s)) System.out.println("Valid");
        else System.out.println("Invalid");
        sc.close();
    }
}