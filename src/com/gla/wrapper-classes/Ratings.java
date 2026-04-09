import java.util.*;
public class Ratings {
    public static void main(String[] args) {
        int[] a = {4, 5, 3, 4};
        ArrayList<Integer> b = new ArrayList<>();
        b.add(5);
        b.add(null);
        b.add(2);
        b.add(4);
        ArrayList<Integer> l = new ArrayList<>();
        for(int x : a) l.add(x);
        for(Integer x : b) l.add(x);
        int s = 0, c = 0;
        for(Integer x : l){
            if(Objects.nonNull(x)){
                s += x;
                c++;
            }
        }
        double avg = c == 0 ? 0 : (double)s / c;
        System.out.println("Average rating = " + avg);
    }
}