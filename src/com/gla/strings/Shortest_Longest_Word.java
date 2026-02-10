import java.util.Scanner;
public class Shortest_Longest_Word {
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
            } else {
                temp += text.charAt(i);
            }
        }
        words[index] = temp;
        return words;
    }
    public static String[][] create2DArray(String[] words) {
        String[][] res = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            res[i][0] = words[i];
            res[i][1] = String.valueOf(findLength(words[i]));
        }
        return res;
    }
    public static String[] shortestLongest(String[][] data) {
        int min = Integer.parseInt(data[0][1]);
        int max = Integer.parseInt(data[0][1]);
        String shortest = data[0][0];
        String longest = data[0][0];
        for (int i = 1; i < data.length; i++) {
            int len = Integer.parseInt(data[i][1]);
            if (len < min) {
                min = len;
                shortest = data[i][0];
            }
            if (len > max) {
                max = len;
                longest = data[i][0];
            }
        }
        return new String[]{shortest, longest};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String txt = sc.nextLine();
        String[] words = splitWords(txt);
        String[][] data = create2DArray(words);
        String[] res = shortestLongest(data);
        System.out.println("Shortest word: " + res[0]);
        System.out.println("Longest word: " + res[1]);
    }
}
