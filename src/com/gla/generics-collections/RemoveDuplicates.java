import java.util.*;
public class RemoveDuplicates {
    static <T> List<T> removeDup(List<T> l) {
        Set<T> s = new LinkedHashSet<>(l);
        return new ArrayList<>(s);
    }
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(3, 1, 2, 2, 3, 4);
        System.out.println(removeDup(l));
    }
}