import java.util.Scanner;
interface Sensitive {
}
class Account implements Sensitive {
    String accNo;
    Account(String accNo) {
        this.accNo = accNo;
    }
}
class PublicInfo {
    String msg;
    PublicInfo(String msg) {
        this.msg = msg;
    }
}
class Security {
    static void process(Object o) {
        if (o instanceof Sensitive) {
            System.out.println("Sensitive data detected");
            System.out.println("Encrypted: ******");
        }
	else System.out.println("Public data: " + o.getClass().getSimpleName());
    }
}
public class DataTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1 Account, 2 PublicInfo: ");
        int ch = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter data: ");
        String s = sc.nextLine();
        Object o;
        if (ch == 1) o = new Account(s);
        else o = new PublicInfo(s);
        Security.process(o);
    }
}