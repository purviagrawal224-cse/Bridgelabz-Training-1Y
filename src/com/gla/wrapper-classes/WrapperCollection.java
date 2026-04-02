import java.util.*;
public class WrapperCollection {
    public static void main(String[] args) {
        double[] p = {10.5, 20.0, 35.75, 5.5};
        ArrayList<Double> a = new ArrayList<>();
        for(double x : p){
            a.add(x);
        }
        double max = a.get(0);
        double s = 0;
        for(double x : a){
            if(x > max) max = x;
            s += x;
        }
        double avg = s / a.size();
        System.out.println("Highest price = " + max);
        System.out.println("Average price = " + avg);
    }
}