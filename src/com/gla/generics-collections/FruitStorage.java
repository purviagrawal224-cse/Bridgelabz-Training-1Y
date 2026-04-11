import java.util.ArrayList;
class Fruit {
    String n;
    Fruit(String n) {
        this.n = n;
    }
    void show() {
        System.out.println(n);
    }
}
class Apple extends Fruit {
    Apple(String n) {
        super(n);
    }
}
class Mango extends Fruit {
    Mango(String n) {
        super(n);
    }
}
class Box<T extends Fruit> {
    ArrayList<T> l = new ArrayList<>();
    void add(T x) {
        l.add(x);
    }
    void display() {
        for (T i : l) {
            i.show();
        }
    }
}
public class FruitStorage {
    public static void main(String[] args) {
        Box<Fruit> b = new Box<>();
        b.add(new Apple("Apple"));
        b.add(new Mango("Mango"));
        b.display();
    }
}