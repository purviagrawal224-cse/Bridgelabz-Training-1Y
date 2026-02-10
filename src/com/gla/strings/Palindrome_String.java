import java.util.Scanner;
public class Palindrome_String {
    public static boolean isPalindrome(String s) {
        int st = 0, end = s.length() - 1;
        while (st < end) {
            if (s.charAt(st) != s.charAt(end)) return false;
            st++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.println(isPalindrome(s) ? "Palindrome" : "Not Palindrome");
        sc.close();
    }
}