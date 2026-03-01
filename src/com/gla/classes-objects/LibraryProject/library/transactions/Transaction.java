package library.transactions;
import library.books.Book;
import library.members.Member;
public class Transaction {
    private Book b;
    private Member m;
    public Transaction(Book b, Member m) {
        this.b = b;
        this.m = m;
    }
    public void issue() {
        System.out.println("\n--- Issue Details ---");
        System.out.println("Book \"" + b.getTitle() + "\" issued to " + m.getName());
    }
}