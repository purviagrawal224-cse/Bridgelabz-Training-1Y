package library.books;
public class Book {
    private int id;
    private String t;
    private String a;
    public Book(int id, String t, String a) {
        this.id = id;
        this.t = t;
        this.a = a;
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return t;
    }
    public void show() {
        System.out.println("Book ID   : " + id);
        System.out.println("Title     : " + t);
        System.out.println("Author    : " + a);
    }
}