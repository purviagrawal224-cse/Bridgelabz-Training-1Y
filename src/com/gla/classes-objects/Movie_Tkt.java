import java.util.Scanner;
public class Movie_Tkt {
    String m;
    int s;
    double p;
    void book(Scanner sc) {
        System.out.print("Enter Movie Name: ");
        m = sc.nextLine();
        System.out.print("Enter Seat No: ");
        s = sc.nextInt();
        System.out.print("Enter Price: ");
        p = sc.nextDouble();
    }
    void display() {
        System.out.println("\nTicket Details");
        System.out.println("Movie: " + m);
        System.out.println("Seat: " + s);
        System.out.println("Price: " + p);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie_Tkt t = new Movie_Tkt();
        t.book(sc);
        t.display();
        sc.close();
    }
}
