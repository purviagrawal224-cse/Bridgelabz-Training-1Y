import java.util.Scanner;
public class Anagram_Check_Gen_Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string : ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string : ");
        String s2 = sc.nextLine();
        if (s1.length() != s2.length()) {
            System.out.println("Not Anagrams");
            return;
        }
        int[] freq = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;
        }
        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) {
                System.out.println("Not Anagrams");
                sc.close();
                return;
            }
        }
        System.out.println("Strings are Anagrams");
        sc.close();
    }
}
