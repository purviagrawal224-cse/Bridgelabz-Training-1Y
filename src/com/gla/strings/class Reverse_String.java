import java.util.Scanner;
public class Reverse_String {
    public static String reverse(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) rev = rev + s.charAt(i);
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.println("Reversed String: " + reverse(s));
        sc.close();
    }
}