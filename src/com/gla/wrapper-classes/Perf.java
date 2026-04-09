import java.util.*;
public class Perf {
    public static void main(String[] args) {
        int n = 1000000;
        long t1 = System.nanoTime();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = i;
        long s1 = 0;
        for(int x : a) s1 += x;
        long t2 = System.nanoTime();
        long t3 = System.nanoTime();
        ArrayList<Integer> l = new ArrayList<>();
        for(int i = 0; i < n; i++) l.add(i);
        long s2 = 0;
        for(int x : l) s2 += x;
        long t4 = System.nanoTime();
        System.out.println("Array sum = " + s1);
        System.out.println("Array time = " + (t2 - t1));
        System.out.println("List sum = " + s2);
        System.out.println("List time = " + (t4 - t3));
    }
}