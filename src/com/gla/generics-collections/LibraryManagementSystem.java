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
        Scanner sc = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        Set<String> members = new HashSet<>();
        Queue<Book> issueQ = new LinkedList<>();
        Stack<Book> returned = new Stack<>();
        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            books.add(new Book(name));
        }
        System.out.print("Enter number of members: ");
        int m = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < m; i++) {
            String id = sc.nextLine();
            if (!members.add(id)) System.out.println("Duplicate member ignored: " + id);
        }
        System.out.print("Enter number of books to issue: ");
        int k = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < k; i++) {
            String name = sc.nextLine();
            for (Book b : books) {
                if (b.name.equals(name))  issueQ.add(b);
            }
        }
        System.out.println("Issuing Books:");
        while (!issueQ.isEmpty()) {
            Book b = issueQ.remove();
            System.out.println("Issued: " + b);
            returned.push(b);
        }
        System.out.println("Re-issuing Last Returned Book:");
        if (!returned.isEmpty()) System.out.println("Re-issued: " + returned.pop());
    }
}
