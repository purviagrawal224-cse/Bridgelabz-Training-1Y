import java.util.Scanner;
class Book {
    int id;
    String t;
    double p;
    static String ln = "Smart City Library";
    Book(int id, String t, double p) {
        this.id = id;
        this.t = t;
        this.p = p;
    }
    double calculateFine(int d) {
        return 0;
    }
}
class TextBook extends Book {
    TextBook(int id, String t, double p) {
        super(id, t, p);
    }
    double calculateFine(int d) {
        return d * 2;
    }
}
class Magazine extends Book {
    Magazine(int id, String t, double p) {
        super(id, t, p);
    }
    double calculateFine(int d) {
        return d * 5;
    }
}
public class SmartLibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter type (1-TextBook, 2-Magazine): ");
        int ch = sc.nextInt();
        System.out.print("Enter id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter title: ");
        String t = sc.nextLine();
        System.out.print("Enter price: ");
        double p = sc.nextDouble();
        System.out.print("Enter days late: ");
        int d = sc.nextInt();
        Book b;
        if (ch == 1) b = new TextBook(id, t, p);
        else b = new Magazine(id, t, p);
        System.out.println("Library: " + Book.ln);
        System.out.println("Fine: " + b.calculateFine(d));
        sc.close();
    }
}