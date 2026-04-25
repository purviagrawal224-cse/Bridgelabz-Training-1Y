package Regex;
import java.util.*;
import java.util.regex.*;
public class ExtractAllCapitalWordsFromText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String s = sc.nextLine();
        String r = "\\b[A-Z][a-z]*\\b";
        Pattern p = Pattern.compile(r);
        Matcher m = p.matcher(s);
        List<String> l = new ArrayList<>();
        while (m.find()) {
            String w = m.group();
            if (!w.equals("The")) l.add(w);
        }
        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i));
            if (i != l.size() - 1) System.out.print(", ");
        }
        sc.close();
    }
}