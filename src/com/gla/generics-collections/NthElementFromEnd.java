import java.util.*;
public class NthElementFromEnd {
    static <T> T findNthFromEnd(LinkedList<T> l, int n) {
        Iterator<T> fast = l.iterator();
        Iterator<T> slow = l.iterator();
        for (int i = 0; i < n; i++) fast.next();
        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }
        return slow.next();
    }
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        System.out.println(findNthFromEnd(l, 2));
    }
}