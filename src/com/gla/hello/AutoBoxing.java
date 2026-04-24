import java.util.*;
public class AutoBoxing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < 5; i++) a.add(sc.nextInt());
        int s = 0;
        for(int x : a){
            s += x;
        }
        System.out.println("Sum of numbers = " + s);
    }
}