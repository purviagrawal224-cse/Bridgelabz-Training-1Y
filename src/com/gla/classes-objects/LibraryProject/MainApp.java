import java.util.Scanner;
import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;
public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book ID: ");
        int bid = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Book Title: ");
        String bt = sc.nextLine();
        System.out.print("Enter Author: ");
        String ba = sc.nextLine();
        Book b = new Book(bid, bt, ba);
        System.out.print("\nEnter Member ID: ");
        int mid = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Member Name: ");
        String mn = sc.nextLine();
        Member m = new Member(mid, mn);
        Transaction tr = new Transaction(b, m);
        System.out.println("\n---Book Added ---");
        b.show();
        System.out.println("\n---Member Registered---");
        m.show();
        tr.issue();
        sc.close();
    }
}