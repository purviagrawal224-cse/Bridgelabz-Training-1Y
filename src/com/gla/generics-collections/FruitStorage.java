import java.util.*;
class Fruit {
    String name;
    Fruit(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }
}
class Apple extends Fruit {
    Apple(String name) {
        super(name);
    }
}
class Mango extends Fruit {
    Mango(String name) {
        super(name);
    }
}
class FruitBox<T extends Fruit> {
    List<T> list = new ArrayList<>();
    void add(T f) {
        list.add(f);
    }
    void show() {
        for (T f : list) System.out.println(f);
    }
}
public class FruitStorage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FruitBox<Apple> apples = new FruitBox<>();
        FruitBox<Mango> mangoes = new FruitBox<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            int ch = sc.nextInt();
            sc.nextLine();
            if (ch == 1) apples.add(new Apple(sc.nextLine()));
            else if (ch == 2) mangoes.add(new Mango(sc.nextLine()));
        }
        apples.show();
        mangoes.show();
    }
}
