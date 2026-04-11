import java.util.*;
public class NthFromEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLine());
        }
        int k = sc.nextInt();
        Iterator<String> fast = list.iterator();
        Iterator<String> slow = list.iterator();
        for (int i = 0; i < k; i++) {
            if (fast.hasNext()) fast.next();
            else {
                System.out.println("Invalid");
                return;
            }
        }
        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }
        System.out.println(slow.next());
    }
}
