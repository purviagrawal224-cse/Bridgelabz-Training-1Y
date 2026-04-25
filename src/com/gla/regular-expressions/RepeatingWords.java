package Regex;
import java.util.*;
import java.util.regex.*;
public class RepeatingWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String s = sc.nextLine();
        String r = "\\b(\\w+)\\s+\\1\\b";
        Pattern p = Pattern.compile(r, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(s);
        while (m.find()) System.out.print(m.group(1) + " ");
        sc.close();
    }
}