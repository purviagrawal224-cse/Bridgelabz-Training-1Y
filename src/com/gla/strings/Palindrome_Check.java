import java.util.Scanner;
public class Palindrome_Check {
    public static boolean is_Pal_Logic1(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
    public static boolean is_Pal_Logic2(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return is_Pal_Logic2(text, start + 1, end - 1);
    }
    public static boolean is_Pal_Logic3(String text) {
        char[] orig = text.toCharArray();
        char[] rev = new char[orig.length];
        int index = 0;
        for (int i = orig.length - 1; i >= 0; i--) rev[index++] = orig[i];
        for (int i = 0; i < orig.length; i++) {
            if (orig[i] != rev[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String txt = sc.nextLine();
        System.out.println("Logic 1 Result: " + is_Pal_Logic1(txt));
        System.out.println("Logic 2 Result: " + is_Pal_Logic2(txt, 0, txt.length() - 1));
        System.out.println("Logic 3 Result: " + is_Pal_Logic3(txt));
        sc.close();
    }
}
