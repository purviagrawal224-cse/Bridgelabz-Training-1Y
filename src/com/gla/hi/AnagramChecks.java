import java.util.Arrays;

public class AnagramChecks {
    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}