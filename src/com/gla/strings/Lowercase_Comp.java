import java.util.Scanner;
public class Lowercase_Comp {
    static String convertToLower(String str) {
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'A' && ch[i] <= 'Z') ch[i] = (char) (ch[i] + 32);
        }
        return new String(ch);
    }
    static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        String use_Lower = convertToLower(txt);
        String builtIn = txt.toLowerCase();
        boolean res = compareStrings(use_Lower, builtIn);
        System.out.println(res);
    }
}