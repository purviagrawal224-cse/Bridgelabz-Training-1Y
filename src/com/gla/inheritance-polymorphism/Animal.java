import java.util.*;
class Animal {
    String n;
    int a;
    Animal(String n, int a) {
        this.n = n;
        this.a = a;
    }
    void makeSound() {
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal {
    Dog(String n, int a) {
        super(n, a);
    }
    void makeSound() {
        System.out.println(n + " says: Woof Woof");
    }
}
class Cat extends Animal {
    Cat(String n, int a) {
        super(n, a);
    }
    void makeSound() {
        System.out.println(n + " says: Meow");
    }
}

class Bird extends Animal {
    Bird(String n, int a) {
        super(n, a);
    }
    void makeSound() {
        System.out.println(n + " says: Chirp Chirp");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter type (dog/cat/bird): ");
        String t = sc.nextLine().toLowerCase();
        System.out.print("Enter name: ");
        String n = sc.nextLine();
        System.out.print("Enter age: ");
        int a = sc.nextInt();
        Animal ob;
        if(t.equals("dog")) ob = new Dog(n, a);
        else if(t.equals("cat")) ob = new Cat(n, a);
        else ob = new Bird(n, a);
        ob.makeSound();
	sc.close();
    }
}
