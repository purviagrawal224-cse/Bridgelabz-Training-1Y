import java.util.*;
public class Marks {
    public static void main(String[] args) {
        Object[] a = {"85", 95, Integer.valueOf(88), "null", "abc"};
        ArrayList<Integer> l = new ArrayList<>();
        for(Object x : a){
            if(x == null) continue;
            if(x instanceof Integer) l.add((Integer)x);
            else if(x instanceof String){
                String s = (String)x;
                if(s.equals("null")) continue;
                try{
                    l.add(Integer.parseInt(s));
                } catch(Exception e){}
            }
        }
        int s = 0, c = 0;
        for(Integer x : l){
            s += x;
            c++;
        }
        double avg = c == 0 ? 0 : (double)s / c;
        System.out.println("Average marks = " + avg);
    }
}