import java.util.Scanner;
public class Character_Frequency_ASCII {
    public static String[][] findFrequency(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) freq[s.charAt(i)]++;
        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) count++;
        }
        String[][] res = new String[count][2];
        int idx = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                res[idx][0] = String.valueOf((char) i);
                res[idx][1] = String.valueOf(freq[i]);
                idx++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[][] res = findFrequency(text);
        System.out.println("Character\tFrequency");
        for (int i = 0; i < res.length; i++) System.out.println(res[i][0] + "\t" + res[i][1]);
        sc.close();
    }
}
