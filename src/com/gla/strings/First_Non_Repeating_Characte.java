import java.util.Scanner;
public class First_Non_Repeating_Character {
    public static char findFirstNonRepeating(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) freq[s.charAt(i)]++;
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 1) return s.charAt(i);
        }
        return '\0';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        char res = findFirstNonRepeating(text);
        if (res != '\0') System.out.println("First Non-Repeating Character: " + res);
        else System.out.println("No Non-Repeating Character Found");
        sc.close();
    }
}