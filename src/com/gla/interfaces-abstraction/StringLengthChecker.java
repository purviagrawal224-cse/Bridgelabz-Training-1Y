import java.util.Scanner;
import java.util.function.Function;
public class StringLengthChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter message: ");
        String s = sc.nextLine();
        System.out.print("Enter limit: ");
        int l = sc.nextInt();
        Function<String, Integer> f = x -> x.length();
        int len = f.apply(s);
        if (len > l) System.out.println("Message exceeds limit");
        else System.out.println("Message within limit");
        System.out.println("Length: " + len);
    }
}