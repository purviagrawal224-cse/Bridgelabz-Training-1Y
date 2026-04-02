import java.util.Scanner;
public class CharCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int l = 0, d = 0, sp = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isLetter(c)) l++;
            else if(Character.isDigit(c)) d++;
            else if(!Character.isWhitespace(c)) sp++;
        }
        System.out.println("Letters = " + l);
        System.out.println("Digits = " + d);
        System.out.println("Special characters = " + sp);
    }
}