package Regex;
import java.util.*;
import java.util.regex.*;
public class ValidateIPAddressFromText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter IP:");
        String s = sc.nextLine();
        String r = "^(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)\\." + "(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)\\." + "(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)\\." + "(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)$";
        if (Pattern.matches(r, s)) System.out.println("Valid");
        else System.out.println("Invalid");
        sc.close();
    }
}