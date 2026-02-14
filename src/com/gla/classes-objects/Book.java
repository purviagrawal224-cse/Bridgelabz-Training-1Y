public class Book {
    private String title;
    private String author;
    private double price;
    public Book() {
        this("Unknown", "Unknown", 0.0);
    }
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public double getPrice() { return price; }
    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }
    public static void main(String[] args) {
        Book defaultBook = new Book();
        Book customBook = new Book("1984", "George Orwell", 299.99);
        defaultBook.display();
        customBook.display();
    }
}