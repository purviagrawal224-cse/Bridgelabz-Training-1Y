package Lambda;
import java.util.*;
public class EmailNotifications {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> l = new ArrayList<>();
        System.out.println("Enter number of emails:");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter email:");
            String e = sc.nextLine();
            l.add(e);
        }
        l.forEach(e -> sendEmailNotification(e));
        sc.close();
    }
    static void sendEmailNotification(String e) {
        System.out.println("Sending email to " + e);
    }
}