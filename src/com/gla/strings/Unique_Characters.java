import java.util.Scanner;
public class Unique_Characters {
    public static int findLength(String s) {
        int len = 0;
        try {
            while (true) {
                s.charAt(len);
                len++;
            }
        } catch (Exception e) {
        }
        return len;
    }
    public static char[] findUniqueCharacters(String s) {
        int len = findLength(s);
        char[] temp = new char[len];
        int count = 0;
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (ch == s.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                temp[count] = ch;
                count++;
            }
        }
        char[] result = new char[count];
        for (int i = 0; i < count; i++) result[i] = temp[i];
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        char[] res = findUniqueCharacters(text);
        System.out.print("Unique Characters: ");
        for (int i = 0; i < res.length; i++) System.out.print(res[i] + " ");
        sc.close();
    }
}
