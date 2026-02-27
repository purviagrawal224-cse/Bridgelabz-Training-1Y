import java.util.Scanner;

public class Substring_Comparison {
    public static String substring_Using_CharAt(String str, int st, int end) {
        String result="";
        for (int i = st; i < end; i++) {
            result = result + str.charAt(i);
        }
        return result;
    }
    public static boolean comp_use_charAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int st = sc.nextInt();
        int end = sc.nextInt();
        String sub1 = substring_Using_CharAt(text, st, end);
        String sub2 = text.substring(st, end);
        boolean res = comp_use_charAt(sub1, sub2);
        System.out.println(sub1);
        System.out.println(sub2);
        System.out.println(res);
    }
}