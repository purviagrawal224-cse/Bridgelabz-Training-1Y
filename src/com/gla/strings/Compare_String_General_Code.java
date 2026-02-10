import java.util.Scanner;
public class Compare_String_General_Code {
    public static void compare_Strings(String s1, String s2) {
        int i = 0;
        int minLen = Math.min(s1.length(), s2.length());
        while(i < minLen) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (s1.charAt(i) < s2.charAt(i)) System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\" in lexicographical order");
                else System.out.println("\"" + s2 + "\" comes before \"" + s1 + "\" in lexicographical order");
                return;
            }
            i++;
        }
        if (s1.length() == s2.length()) System.out.println("Both strings are equal");
        else if (s1.length() < s2.length()) System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\" in lexicographical order");
        else System.out.println("\"" + s2 + "\" comes before \"" + s1 + "\" in lexicographical order");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        compare_Strings(s1, s2);
        sc.close();
    }
}