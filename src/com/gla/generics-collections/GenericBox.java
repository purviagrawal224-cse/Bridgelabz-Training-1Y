import java.util.*;
class Box<T> {
    T val;
    void set(T val) {
        this.val = val;
    }
    T get() {
        return val;
    }
}
public class GenericBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        if (ch == 1) {
            int x = sc.nextInt();
            Box<Integer> b = new Box<>();
            b.set(x);
            System.out.println(b.get());
        } 
        else if (ch == 2) {
            sc.nextLine();
            String s = sc.nextLine();
            Box<String> b = new Box<>();
            b.set(s);
            System.out.println(b.get());
        } 
        else if (ch == 3) {
            double d = sc.nextDouble();
            Box<Double> b = new Box<>();
            b.set(d);
            System.out.println(b.get());
        }
    }
}
