import java.util.Scanner;
public class Circle {
    double radius;
    Circle() {
        this.radius = 1.0;
    }
    Circle(double radius) {
        this.radius = radius;
    }
    double area() {
        return Math.PI * radius * radius;
    }
    double circumference() {
        return 2 * Math.PI * radius;
    }
    void display() {
        System.out.println("Radius: " + radius + ", Area: " + area() + ", Circumference: " + circumference());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double r = sc.nextDouble();
        Circle c = new Circle(r);
        c.display();
        sc.close();
    }
}