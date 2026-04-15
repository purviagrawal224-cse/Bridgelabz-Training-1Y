package Lambda;
import java.util.*;
import java.time.*;
public class LoggingTransactions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> l = new ArrayList<>();
        System.out.println("Enter number of transactions:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter transaction id:");
            int id = sc.nextInt();
            l.add(id);
        }
        l.forEach(id -> System.out.println(LocalDateTime.now() + " - Transaction: " + id));
        sc.close();
    }
}