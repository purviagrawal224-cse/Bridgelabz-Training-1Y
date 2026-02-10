import java.util.Scanner;

public class String_Char {
    public static char[] Chars_Using_CharAt(String text) {
        char[] arr = new char[text.length()];
        for (int i = 0; i < text.length(); i++) arr[i] = text.charAt(i);
        return arr;
    }
    public static boolean compare_Char_Arrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.next();
        char[] arr = Chars_Using_CharAt(txt);
        char[] brr = txt.toCharArray();
        boolean res = compare_Char_Arrays(arr, brr);
        System.out.println(res);
    }
}