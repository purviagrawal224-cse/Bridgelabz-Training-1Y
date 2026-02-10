import java.util.Scanner;
public class Longest_Word {
    public static String findLongest(String sentence) {
        String[] words = sentence.split(" ");
        String longest = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longest.length()) longest = words[i];
        }
        return longest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();
        System.out.println("Longest Word: " + findLongest(sentence));
        sc.close();
    }
}