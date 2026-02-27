import java.util.Scanner;
public class Trim_String_Using_CharAt {
    public static int[] findTrimIndexes(String str) {
        int st = 0;
        int end = 0;
        int len = 0;
        try {
            while (true) {
                str.charAt(len);
                len++;
            }
        } catch (Exception e) {
        }
        while (st<len && str.charAt(st)==' ') st++;
        end = len - 1;
        while (end >= 0 && str.charAt(end) == ' ') end--;
        return new int[]{st, end};
    }
    public static String substringUsingCharAt(String str, int start, int end) {
        String result = "";
        for (int i=start; i <=end; i++) result += str.charAt(i);
        return result;
    }
    public static boolean compareStrings(String s1, String s2) {
        int i = 0;
        try {
            while (true) {
                if (s1.charAt(i)!=s2.charAt(i)) return false;
                i++;
            }
        } catch (Exception e) {
        }
        try {
            s2.charAt(i);
            return false;
        } catch (Exception e) {
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String txt = sc.nextLine();
        int[] idx = findTrimIndexes(txt);
        String trimmed_Cus = "";
        if (idx[0] <= idx[1]) trimmed_Cus = substringUsingCharAt(txt, idx[0], idx[1]);
        String trimmed_BuiltIn = txt.trim();
        boolean isSame = compareStrings(trimmed_Cus, trimmed_BuiltIn);
        System.out.println("Custom Trimmed: [" + trimmed_Cus + "]");
        System.out.println("Built-in Trimmed: [" + trimmed_BuiltIn + "]");
        System.out.println("Both are equal: " + isSame);
    }
}
