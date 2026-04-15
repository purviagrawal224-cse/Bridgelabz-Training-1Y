package Regex;
import java.util.*;
import java.util.regex.*;
public class UsernameValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username:");
        String s = sc.nextLine();
        String r = "^[A-Za-z][A-Za-z0-9_]{4,14}$";
        if (Pattern.matches(r, s)) System.out.println("Valid");
        else System.out.println("Invalid");
        sc.close();
    }
}