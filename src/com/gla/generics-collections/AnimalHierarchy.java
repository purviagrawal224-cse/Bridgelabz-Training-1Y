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
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Tommy"));
        dogs.add(new Dog("Rocky"));
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Kitty"));
        cats.add(new Cat("Mimi"));
        printAnimals(dogs);
        printAnimals(cats);
    }
}
