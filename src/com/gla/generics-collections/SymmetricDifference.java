import java.util.*;
public class SymmetricDifference {
    static <T> Set<T> symDiff(Set<T> s1, Set<T> s2) {
        Set<T> u = new HashSet<>(s1);
        u.addAll(s2);
        Set<T> i = new HashSet<>(s1);
        i.retainAll(s2);
        u.removeAll(i);
        return u;
    }
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(3, 4, 5));
        System.out.println(symDiff(s1, s2));
    }
}