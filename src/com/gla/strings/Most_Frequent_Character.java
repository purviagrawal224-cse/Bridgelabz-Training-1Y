import java.util.Scanner;
public class Most_Frequent_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String s = sc.nextLine();
        int maxCount = 0;
        char maxChar = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ch) count++;
            }
            if (count > maxCount) {
                maxCount = count;
                maxChar = ch;
            }
        }
        System.out.println("Most Frequent Character : '" +maxChar+ "'");
        sc.close();
    }
}