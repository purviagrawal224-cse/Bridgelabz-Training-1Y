import java.util.Scanner;
public class Library_Book_System {
    String title;
    String author;
    double price;
    boolean available;
    Library_Book_System() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
        this.available = true;
    }
    Library_Book_System(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }
    void borrow() {
        if (available) {
            System.out.println("You have borrowed \"" + title + "\"");
            available = false;
        } 
        else System.out.println("Sorry, \"" + title + "\" is not available");
    }
    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price + ", Available: " + available);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book title: ");
        String t = sc.nextLine();
        System.out.print("Enter author: ");
        String a = sc.nextLine();
        System.out.print("Enter price: ");
        double p = sc.nextDouble();
        Library_Book_System book = new Library_Book_System(t, a, p); // fixed here
        book.display();
        System.out.print("Do you want to borrow this book? (yes/no): ");
        sc.nextLine(); // consume newline
        String choice = sc.nextLine();
        if (choice.equalsIgnoreCase("yes")) book.borrow();
        book.display();
        sc.close();
    }
}
