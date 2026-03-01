import java.util.Scanner;
public class Circle_Area {
    double radius;
    void input(Scanner sc) {
        System.out.print("Enter Radius: ");
        radius = sc.nextDouble();
    }
    double calculateArea() {
        return Math.PI * radius * radius;
    }
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
    void display() {
        System.out.println("\nCircle Details");
        System.out.println("Area: " +calculateArea());
        System.out.println("Circumference: " +calculateCircumference());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle_Area c = new Circle_Area();
        c.input(sc);
        c.display();
        sc.close();
    }
}
