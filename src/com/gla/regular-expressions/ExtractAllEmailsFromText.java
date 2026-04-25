package Regex;
import java.util.*;
import java.util.regex.*;
public class ExtractAllEmailsFromText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String s = sc.nextLine();
        String r = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        Pattern p = Pattern.compile(r);
        Matcher m = p.matcher(s);
        while (m.find()) System.out.println(m.group());
        sc.close();
    }
}