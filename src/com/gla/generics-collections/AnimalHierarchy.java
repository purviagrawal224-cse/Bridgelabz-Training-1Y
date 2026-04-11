import java.util.*;
class Animal {
    String n;
    Animal(String n) {
        this.n = n;
    }
    void show() {
        System.out.println(n);
    }
}
class Dog extends Animal {
    Dog(String n) {
        super(n);
    }
}
class Cat extends Animal {
    Cat(String n) {
        super(n);
    }
}
public class AnimalHierarchy {
    static void printAnimals(List<? extends Animal> a) {
        for (Animal x : a) {
            x.show();
        }
    }
    public static void main(String[] args) {
        List<Dog> d = Arrays.asList(new Dog("Dog1"), new Dog("Dog2"));
        List<Cat> c = Arrays.asList(new Cat("Cat1"), new Cat("Cat2"));
        printAnimals(d);
        printAnimals(c);
    }
}