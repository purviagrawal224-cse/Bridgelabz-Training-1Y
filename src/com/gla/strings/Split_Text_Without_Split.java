import java.util.Arrays;
import java.util.Scanner;

public class Split_Text_Without_Split {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }
    public static String[] customSplit(String str) {
        int len = findLength(str);
        int words = 0;
        boolean inWord = false;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) != ' ' && !inWord) {
                words++;
                inWord = true;
            }
            if (str.charAt(i) == ' ') inWord = false;
        }
        String[] result = new String[words];
        int index = 0;
        String temp = "";
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) != ' ') temp += str.charAt(i);
            else if (!temp.equals("")) {
                result[index++] = temp;
                temp = "";
            }
        }
        if (!temp.equals("")) result[index] = temp;
        return result;
    }
    public static boolean comp_Arrays(String[] a, String[] b) {
        return Arrays.equals(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String txt = sc.nextLine();
        String[] cus = customSplit(txt);
        String[] builtIn = txt.split(" ");
        System.out.println("Custom Split Result: " + Arrays.toString(cus));
        System.out.println("Built-in Split Result: " + Arrays.toString(builtIn));
        System.out.println("Are both results same? " + comp_Arrays(cus, builtIn));
    }
}
