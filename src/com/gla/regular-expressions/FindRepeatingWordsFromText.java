package Regex;
import java.util.*;
import java.util.regex.*;
public class FindRepeatingWordsFromText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String s = sc.nextLine();
        String r = "\\b(\\w+)\\s+\\1\\b";
        Pattern p = Pattern.compile(r, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(s);
        Set<String> set = new LinkedHashSet<>();
        while (m.find()) set.add(m.group(1));
        int i = 0;
        for (String x : set) {
            System.out.print(x);
            if (i != set.size() - 1) System.out.print(", ");
            i++;
        }
        sc.close();
    }
}