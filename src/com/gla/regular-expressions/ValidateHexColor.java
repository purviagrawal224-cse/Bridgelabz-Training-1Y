package Regex;
import java.util.*;
import java.util.regex.*;
public class ValidateHexColor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hex color:");
        String s = sc.nextLine();
        String r = "^#[0-9A-Fa-f]{6}$";
        if (Pattern.matches(r, s)) System.out.println("Valid");
        else System.out.println("Invalid");
        sc.close();
    }
}