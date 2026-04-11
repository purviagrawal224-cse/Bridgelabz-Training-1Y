import java.util.*;
public class ReverseList {
    static <T> void reverse(List<T> l) {
        int i = 0, j = l.size() - 1;
        while(i<j){
            T temp = l.get(i);
            l.set(i, l.get(j));
            l.set(j, temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        reverse(a);
        System.out.println(a);
        List<Integer> b = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        reverse(b);
        System.out.println(b);
    }
}