import java.util.*;
public class Emp {
    public static void main(String[] args) {
        int[] a = {25, 30, 22, 40, 28};
        ArrayList<Integer> l = new ArrayList<>();
        for(int x : a) l.add(x);
        int mn = Collections.min(l);
        int mx = Collections.max(l);
        System.out.println("Youngest age = "+mn);
        System.out.println("Oldest age = "+mx);
    }
}