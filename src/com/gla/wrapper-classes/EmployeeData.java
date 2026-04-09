import java.util.*;
public class EmployeeData {
    public static void main(String[] args) {
        int[] a = {25, 30, 22, 40, 28};
        ArrayList<Integer> l = new ArrayList<>();
        for(int x : a){
            l.add(x);
        }
        int min = Collections.min(l);
        int max = Collections.max(l);
        System.out.println("Youngest age = " + min);
        System.out.println("Oldest age = " + max);
    }
}