import java.util.Scanner;
public class LoginCheck {
    public static boolean check(String s) {
        try {
            int x = Integer.parseInt(s);
            return x >= 18;
        } catch (Exception e) {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(check(s));
    }
}