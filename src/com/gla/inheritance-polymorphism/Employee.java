import java.util.*;
class import java.util.*;
class Employee {
    String n;
    int id;
    double s;
    Employee(String n, int id, double s) {
        this.n = n;
        this.id = id;
        this.s = s;
    }
    void displayDetails() {
        System.out.println("Name : " + n);
        System.out.println("ID : " + id);
        System.out.println("Salary : " + s);
    }
}
class Manager extends Employee {
    int ts;
    Manager(String n, int id, double s, int ts) {
        super(n, id, s);
        this.ts = ts;
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size : " + ts);
    }
}
class Developer extends Employee {
    String pl;
    Developer(String n, int id, double s, String pl) {
        super(n, id, s);
        this.pl = pl;
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language : " + pl);
    }
}
class Intern extends Employee {
    int d;
    Intern(String n, int id, double s, int d) {
        super(n, id, s);
        this.d = d;
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println("Duration (months) : " + d);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter type (manager/developer/intern): ");
        String t = sc.nextLine().toLowerCase();
        System.out.print("Enter name : ");
        String n = sc.nextLine();
        System.out.print("Enter id : ");
        int id = sc.nextInt();
        System.out.print("Enter salary : ");
        double s = sc.nextDouble();
        sc.nextLine();
        Employee ob;
        if(t.equals("manager")) {
            System.out.print("Enter team size : ");
            int ts = sc.nextInt();
            ob = new Manager(n, id, s, ts);
        }
        else if(t.equals("developer")) {
            System.out.print("Enter programming language : ");
            String pl = sc.nextLine();
            ob = new Developer(n, id, s, pl);
        }
        else {
            System.out.print("Enter internship duration (months) : ");
            int d = sc.nextInt();
            ob = new Intern(n, id, s, d);
        }
        System.out.println();
        ob.displayDetails();
        sc.close();
    }
}
{
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
