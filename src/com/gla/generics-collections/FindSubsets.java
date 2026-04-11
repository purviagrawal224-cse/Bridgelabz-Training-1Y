import java.util.*;
public class FindSubsets {
    static <T> boolean isSubset(Set<T> s1, Set<T> s2) {
        return s2.containsAll(s1);
    }
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        System.out.println(isSubset(s1, s2));
    }
}