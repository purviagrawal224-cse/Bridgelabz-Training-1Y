import java.util.Scanner;

public class Words_With_Length_2D_Array {
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
    public static String[] splitWords(String text) {
        int count = 0;
        int len = findLength(text);
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') count++;
        }
        String[] words = new String[count + 1];
        int index = 0;
        String temp = "";
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                words[index++] = temp;
                temp = "";
            }
            else temp += text.charAt(i);
        }
        words[index] = temp;
        return words;
    }
    public static String[][] create_2DArray(String[] words) {
        String[][] res = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            res[i][0] = words[i];
            res[i][1] = String.valueOf(findLength(words[i]));
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[] words = splitWords(text);
        String[][] data = create_2DArray(words);
        System.out.println("Word\tLength");
        for (int i = 0; i < data.length; i++) {
            int len = Integer.parseInt(data[i][1]);
            System.out.println(data[i][0] + "\t" + len);
        }
    }
}
