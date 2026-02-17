import java.util.*;
class Library_Books {
    String t;
    int py;
    Library_Books(String t, int py) {
        this.t = t;
        this.py = py;
    }
    void displayInfo() {
        System.out.println("Title: " + t);
        System.out.println("Publication Year: " + py);
    }
}
class Author extends Library_Books {
    String n;
    String b;
    Author(String t, int py, String n, String b) {
        super(t, py);
        this.n = n;
        this.b = b;
    }
    void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name: " + n);
        System.out.println("Bio: " + b);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book title: ");
        String t = sc.nextLine();
        System.out.print("Enter publication year: ");
        int py = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter author name: ");
        String n = sc.nextLine();
        System.out.print("Enter author bio: ");
        String b = sc.nextLine();
        Author ob = new Author(t, py, n, b);
        System.out.println();
        ob.displayInfo();
        sc.close();
    }
}
