package Regex;

import java.util.*;
import java.util.regex.*;
public class ExtractProgrammingLanguages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String s = sc.nextLine();
        String r = "\\b(Java|Python|JavaScript|Go)\\b";
        Pattern p = Pattern.compile(r);
        Matcher m = p.matcher(s);
        List<String> l = new ArrayList<>();
        while (m.find()) l.add(m.group());
        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i));
            if (i != l.size() - 1) System.out.print(", ");
        }
        sc.close();
    }
}