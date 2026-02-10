import java.util.Scanner;
public class Vowels_Consonants_Count {
    public static String checkChar(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch = (char)(ch + 32);
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }
    public static int[] countVowelsConsonants(String str) {
        int vowels = 0;
        int consonants = 0;
        int i = 0;
        try {
            while (true) {
                char ch = str.charAt(i);
                String res = checkChar(ch);
                if (res.equals("Vowel")) vowels++;
                else if (res.equals("Consonant")) consonants++;
                i++;
            }
        } catch (Exception e) {
        }
        return new int[]{vowels, consonants};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String txt = sc.nextLine();
        int[] res = countVowelsConsonants(txt);
        System.out.println("Vowels : " + res[0]);
        System.out.println("Consonants : " + res[1]);
    }
}
