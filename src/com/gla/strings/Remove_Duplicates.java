import java.util.Scanner;
public class Remove_Duplicates {
    public static String remove_Duplicates(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (res.indexOf(ch) == -1) res = res + ch;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.println("After removing duplicates: " + remove_Duplicates(s));
        sc.close();
    }
}