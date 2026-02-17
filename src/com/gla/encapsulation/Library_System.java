import java.util.*;
abstract class Book {
    private int id;
    private String nm;
    private double pr;
    Book(int id, String nm, double pr) {
        this.id = id;
        this.nm = nm;
        this.pr = pr;
    }
    int getId() { return id; }
    String getNm() { return nm; }
    double getPr() { return pr; }
    abstract double calFine(int d);
    void show() {
        System.out.println("Id   : " + id);
        System.out.println("Name : " + nm);
        System.out.println("Price: " + pr);
    }
}
interface Issue {
    void issueBook(String s);
    String getStatus();
}
class Novel extends Book implements Issue {
    private String st;
    Novel(int id, String nm, double pr) {
        super(id, nm, pr);
    }
    public double calFine(int d) {
        return d * 5;   // 5 per day fine
    }
    public void issueBook(String s) {
        st = s;
    }
    public String getStatus() {
        return st;
    }
}
class TextBook extends Book {
    TextBook(int id, String nm, double pr) {
        super(id, nm, pr);
    }
    public double calFine(int d) {
        return d * 2;   // 2 per day fine
    }
}
public class Library_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> list = new ArrayList<>();
        System.out.print("Enter total books : ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("\n1.Novel  2.TextBook");
            System.out.print("Choose type : ");
            int ch = sc.nextInt();
            sc.nextLine();
            System.out.print("Id : ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name : ");
            String nm = sc.nextLine();
            System.out.print("Price : ");
            double pr = sc.nextDouble();
            sc.nextLine();
            Book b;
            if (ch == 1){
                b = new Novel(id, nm, pr);
                ((Issue) b).issueBook("Issued");
            } 
	    else b = new TextBook(id, nm, pr);
            list.add(b);
        }
        System.out.println("\n--- Book Details ---");
        for (Book b : list) {
            b.show();
            System.out.print("Late days : ");
            int d = sc.nextInt();
            System.out.println("Fine : " + b.calFine(d));
            if (b instanceof Issue)  System.out.println("Status : " + ((Issue) b).getStatus());
            System.out.println("---");
        }
        sc.close();
    }
}
