import java.util.Scanner;
public class Remove_Specific_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String s = sc.nextLine();
        System.out.print("Enter character to remove: ");
        char rem = sc.next().charAt(0);
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != rem) res += s.charAt(i);
        }
        System.out.println("Modified String: \"" +res+ "\"");
        sc.close();
    }
}
