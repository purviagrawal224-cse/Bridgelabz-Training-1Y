import java.util.Scanner;
public class Person {
    String name;
    int age;
    Person() {
        this.name = "Unknown";
        this.age = 0;
    }
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String n = sc.nextLine();
        System.out.print("Enter age: ");
        int a = sc.nextInt();
        Person orig = new Person(n, a);
        Person copy = new Person(orig);
        orig.display();
        copy.display();
        sc.close();
    }
}
