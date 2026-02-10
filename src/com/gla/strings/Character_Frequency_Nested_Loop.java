import java.util.Scanner;
public class Character_Frequency_Nested_Loop {
    public static String[] findFrequency(String text) {
        char[] ch = text.toCharArray();
        int len = ch.length;
        int[] freq = new int[len];
        for (int i = 0; i < len; i++) {
            freq[i] = 1;
            if (ch[i] == '0') continue;
            for (int j = i + 1; j < len; j++) {
                if (ch[i] == ch[j]) {
                    freq[i]++;
                    ch[j] = '0';
                }
            }
        }
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (ch[i] != '0') count++;
        }
        String[] res = new String[count];
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (ch[i] != '0') res[index++] = ch[i] + " : " + freq[i];
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String txt = sc.nextLine();
        String[] result = findFrequency(txt);
        System.out.println("Character Frequency:");
        for (int i = 0; i < result.length; i++) System.out.println(result[i]);
        sc.close();
    }
}
