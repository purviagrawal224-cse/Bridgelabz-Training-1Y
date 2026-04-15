package Regex;
import java.util.*;
import java.util.regex.*;
public class LicensePlateValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter license plate:");
        String s = sc.nextLine();
        String r = "^[A-Z]{2}[0-9]{4}$";
        if (Pattern.matches(r, s)) System.out.println("Valid");
        else System.out.println("Invalid");
        sc.close();
    }
}