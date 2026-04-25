package Regex;
import java.util.*;
import java.util.regex.*;
public class SSNValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String s = sc.nextLine();
        String r = "\\b\\d{3}-\\d{2}-\\d{4}\\b";
        Pattern p = Pattern.compile(r);
        Matcher m = p.matcher(s);
        boolean f = false;
        while (m.find()) {
            System.out.println(m.group() + " is valid");
            f = true;
        }
        if (!f) System.out.println("No valid SSN found");
        sc.close();
    }
}