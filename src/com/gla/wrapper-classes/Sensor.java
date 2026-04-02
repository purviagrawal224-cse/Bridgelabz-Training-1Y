import java.util.*;
public class Sensor {
    public static void add(ArrayList<Double> l, Double x) {
        l.add(x);
    }
    public static double avg(ArrayList<Double> l) {
        double s = 0;
        for(double x : l){
            s += x;
        }
        return s / l.size();
    }
    public static void main(String[] args) {
        ArrayList<Double> l = new ArrayList<>();
        double a = 25.5;
        Double b = 30.0;
        add(l, a);
        add(l, b);
        for(double x : l) System.out.println(x);
        System.out.println("Average = "+avg(l));
    }
}