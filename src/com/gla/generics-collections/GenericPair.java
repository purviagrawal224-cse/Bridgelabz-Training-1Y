import java.util.*;
class Pair<T, U> {
    T first;
    U second;
    Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }
    T getFirst() {
        return first;
    }
    U getSecond() {
        return second;
    }
}
public class GenericPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        sc.nextLine();
        if (ch == 1) {
            String name = sc.nextLine();
            int age = sc.nextInt();
            Pair<String, Integer> p = new Pair<>(name, age);
            System.out.println(p.getFirst() + " " + p.getSecond());
        } 
        else if (ch == 2) {
            int a = sc.nextInt();
            double b = sc.nextDouble();
            Pair<Integer, Double> p = new Pair<>(a, b);
            System.out.println(p.getFirst() + " " + p.getSecond());
        }
    }
}
