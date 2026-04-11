import java.util.*;
class Book {
    String name;
    Book(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Set<String> members = new HashSet<>();
        Queue<Book> issueQ = new LinkedList<>();
        Stack<Book> returned = new Stack<>();
        books.add(new Book("Java"));
        books.add(new Book("DSA"));
        books.add(new Book("OS"));
        members.add("M1");
        members.add("M2");
        members.add("M1");
        issueQ.add(books.get(0));
        issueQ.add(books.get(1));
        System.out.println("Issuing Books:");
        while (!issueQ.isEmpty()) {
            Book b = issueQ.remove();
            System.out.println("Issued: " + b);
            returned.push(b);
        }
        System.out.println("Re-issuing Last Returned Book:");
        if (!returned.isEmpty()) {
            Book b = returned.pop();
            System.out.println("Re-issued: " + b);
        }
        System.out.println("All Books:");
        for (Book b : books) System.out.println(b);
        System.out.println("Members:");
        for (String m : members) {
            System.out.println(m);
        }
    }
}