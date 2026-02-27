import java.util.Scanner;
public class Unique_Character_Frequency_ASCII {
    public static char[] uniqueCharacters(String s) {
        int len = s.length();
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

            if (isUnique) temp[count++] = ch;
        }
        char[] res = new char[count];
        for (int i = 0; i < count; i++) res[i] = temp[i];
        return res;
    }
    public static String[][] findFrequency(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) freq[s.charAt(i)]++;
        char[] unique = uniqueCharacters(s);
        String[][] res = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            res[i][0] = String.valueOf(unique[i]);
            res[i][1] = String.valueOf(freq[unique[i]]);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String txt = sc.nextLine();
        String[][] res = findFrequency(txt);
        System.out.println("Character\tFrequency");
        for (int i = 0; i < res.length; i++) System.out.println(res[i][0] + "\t" + res[i][1]);
        sc.close();
    }
}
