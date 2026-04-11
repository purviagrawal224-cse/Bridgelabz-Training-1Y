import java.util.Scanner;
class Pair<T, U> {
    T f;
    U s;
    Pair(T a, U b) {
        f = a;
        s = b;
    }
    T getFirst() {
        return f;
    }
    U getSecond() {
        return s;
    }
}
public class TestPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        Pair<String, Integer> p = new Pair<>(name,age);
        System.out.println(p.getFirst());
        System.out.println(p.getSecond());
    }
}