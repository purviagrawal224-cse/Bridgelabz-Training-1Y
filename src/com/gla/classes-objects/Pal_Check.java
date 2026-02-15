import java.util.Scanner;
public class Pal_Check {
    String t;
    void input(Scanner sc) {
        System.out.print("Enter Text: ");
        t = sc.nextLine();
    }
    boolean check() {
        int l = 0;
        int r = t.length() - 1;
        while (l < r) {
            if (t.charAt(l) != t.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
    void display() {
        if (check()) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pal_Check p = new Pal_Check();
        p.input(sc);
        p.display();

        sc.close();
    }
}
