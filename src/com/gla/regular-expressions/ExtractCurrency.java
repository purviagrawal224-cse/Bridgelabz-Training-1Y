package Regex;
import java.util.*;
import java.util.regex.*;
public class ExtractCurrency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String s = sc.nextLine();
        String r = "\\$?\\b\\d+\\.\\d{2}\\b";
        Pattern p = Pattern.compile(r);
        Matcher m = p.matcher(s);
        while (m.find()) System.out.print(m.group() + " ");
        sc.close();
    }
}