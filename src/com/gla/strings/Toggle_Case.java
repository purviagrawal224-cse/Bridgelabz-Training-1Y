import java.util.Scanner;
public class Toggle_Case {
    public static String toggle_Case(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') res += (char)(ch + 32);
            else if (ch >= 'a' && ch <= 'z') res += (char)(ch - 32);
            else res += ch;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.println("Toggled String: "+toggle_Case(s));
        sc.close();
    }
}