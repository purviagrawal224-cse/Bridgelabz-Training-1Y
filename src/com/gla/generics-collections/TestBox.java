import java.util.Scanner;
class Box<T> {
    T v;
    void set(T x) {
        v = x;
    }
    T get() {
        return v;
    }
}
public class TestBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Box<Integer> b1 = new Box<>();
        int a = sc.nextInt();
        b1.set(a);
        System.out.println(b1.get());
        Box<String> b2 = new Box<>();
        String s = sc.next();
        b2.set(s);
        System.out.println(b2.get());
        Box<Double> b3 = new Box<>();
        double d = sc.nextDouble();
        b3.set(d);
        System.out.println(b3.get());
    }
}