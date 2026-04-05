import java.util.Scanner;
interface SecurityUtils {
    static boolean isStrong(String p) {
        if (p.length() < 8) return false;
        boolean u = false, l = false, d = false;
        for (char c : p.toCharArray()) {
            if (Character.isUpperCase(c)) u = true;
            if (Character.isLowerCase(c)) l = true;
            if (Character.isDigit(c)) d = true;
        }
        return u && l && d;
    }
}
public class PasswordValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String p = sc.nextLine();
        if (SecurityUtils.isStrong(p)) System.out.println("Strong Password");
        else System.out.println("Weak Password");
    }
}