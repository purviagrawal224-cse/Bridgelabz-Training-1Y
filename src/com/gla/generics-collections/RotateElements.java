import java.util.*;
public class RotateElements {
    static <T> void rotate(List<T> l, int k) {
        int n = l.size();
        k = k % n;
        List<T> temp = new ArrayList<>();
        for(int i = k; i < n; i++) temp.add(l.get(i));
        for(int i = 0; i < k; i++) temp.add(l.get(i));
        for(int i = 0; i < n; i++) l.set(i, temp.get(i));
    }
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        rotate(l, 2);
        System.out.println(l);
    }
}