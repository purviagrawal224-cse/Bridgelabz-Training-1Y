import java.util.*;
interface Worker {
    void performDuties();
}
class person_2 {
    String n;
    int id;
    person_2(String n, int id) {
        this.n = n;
        this.id = id;
    }
    void display() {
        System.out.println("Name : " + n);
        System.out.println("ID : " + id);
    }
}
class Chef extends person_2 implements Worker {

    Chef(String n, int id) {
        super(n, id);
    }
    public void performDuties() {
        System.out.println("Duties : Preparing and cooking food");
    }
    void show() {
        System.out.println("Role : Chef");
        display();
        performDuties();
        System.out.println();
    }
}
class Waiter extends person_2 implements Worker {

    Waiter(String n, int id) {
        super(n, id);
    }
    public void performDuties() {
        System.out.println("Duties : Serving customers and taking orders");
    }
    void show() {
        System.out.println("Role : Waiter");
        display();
        performDuties();
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num of workers : ");
        int n = sc.nextInt();
        sc.nextLine();
        person_2[] arr = new person_2[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Enter role (chef/waiter) : ");
            String r = sc.nextLine().toLowerCase();
            System.out.print("Enter name : ");
            String name = sc.nextLine();
            System.out.print("Enter id : ");
            int id = sc.nextInt();
            sc.nextLine();
            if(r.equals("chef")) arr[i] = new Chef(name, id);
            else arr[i] = new Waiter(name, id);
        }
        System.out.println();
        for(int i = 0; i < n; i++) {
            if(arr[i] instanceof Chef) ((Chef)arr[i]).show();
            else ((Waiter)arr[i]).show();
	}
        sc.close();
    }
}
