import java.util.Scanner;
public class Book {
    String title;
    String author;
    double price;
    Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter title of the book: ");
        String t = sc.nextLine();
        System.out.print("Enter author of the book: ");
        String a = sc.nextLine();
        System.out.print("Enter price of the book: ");
        double p = sc.nextDouble();
        Book userBook = new Book(t, a, p);
        Book defaultBook = new Book();
        defaultBook.display();
        userBook.display();
        sc.close();
    }
}
