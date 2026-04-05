import java.util.Scanner;
interface BackupTag {
}
class User implements BackupTag {
    String n;
    User(String n) {
        this.n = n;
    }
}
class Cache {
    String c;
    Cache(String c) {
        this.c = c;
    }
}
class Backup {
    static void process(Object o) {
        if (o instanceof BackupTag) System.out.println("Backup done for: " + o.getClass().getSimpleName());
        else System.out.println("Backup not allowed for: " + o.getClass().getSimpleName());
    }
}
public class TestBackup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1 User, 2 Cache: ");
        int ch = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name/data: ");
        String s = sc.nextLine();
        Object o;
        if (ch == 1) o = new User(s);
        else o = new Cache(s);
        Backup.process(o);
    }
}