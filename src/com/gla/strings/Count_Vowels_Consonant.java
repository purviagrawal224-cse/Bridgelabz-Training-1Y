import java.util.Scanner;
public class Count_Vowels_Consonant {
    public static void count_Vowels_Consonants(String txt) {
        int vowels = 0, consonants = 0;
        txt = txt.toLowerCase();
        for (int i = 0; i < txt.length(); i++) {
            char ch = txt.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') vowels++;
                else consonants++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String txt = sc.nextLine();
        count_Vowels_Consonants(txt);
        sc.close();
    }
}