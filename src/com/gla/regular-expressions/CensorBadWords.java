package Regex;
import java.util.*;
public class CensorBadWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence:");
        String s = sc.nextLine();
        System.out.println("Enter number of bad words:");
        int n = sc.nextInt();
        sc.nextLine();
        List<String> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter bad word:");
            String w = sc.nextLine();
            l.add(w);
        }
        String r = "\\b(" + String.join("|", l) + ")\\b";
        s = s.replaceAll("(?i)" + r, "****");
        System.out.println(s);
        sc.close();
    }
}