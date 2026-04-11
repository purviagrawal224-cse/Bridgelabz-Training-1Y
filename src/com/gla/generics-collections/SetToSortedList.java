import java.util.*;
public class SetToSortedList {
    static List<Integer> convert(Set<Integer> s) {
        List<Integer> l = new ArrayList<>(s);
        Collections.sort(l);
        return l;
    }
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>(Arrays.asList(5, 3, 9, 1));
        System.out.println(convert(s));
    }
}