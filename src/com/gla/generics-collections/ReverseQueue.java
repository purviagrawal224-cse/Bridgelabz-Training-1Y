import java.util.*;
public class ReverseQueue {
    static void reverse(Queue<Integer> q) {
        if (q.isEmpty()) return;
        int x = q.remove();
        reverse(q);
        q.add(x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) q.add(sc.nextInt());
        reverse(q);
        System.out.println("Reversed Queue:");
        while (!q.isEmpty()) System.out.print(q.remove() + " ");
    }
}
