import java.util.*;
class Animal {
    String name;
    Animal(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }
}
class Dog extends Animal {
    Dog(String name) {
        super(name);
    }
}
class Cat extends Animal {
    Cat(String name) {
        super(name);
    }
}
public class AnimalHierarchy {
    static void printAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) {
            System.out.println(a);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Dog> dogs = new ArrayList<>();
        List<Cat> cats = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            int ch = sc.nextInt();
            sc.nextLine();
            if (ch == 1) dogs.add(new Dog(sc.nextLine()));
            else if (ch == 2) cats.add(new Cat(sc.nextLine()));
        }
        printAnimals(dogs);
        printAnimals(cats);
    }
}
