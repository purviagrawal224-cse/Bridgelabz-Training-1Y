import java.util.Scanner;
class Course {
    int id;
    String name;
    double price;
    static String platformName = "EduTech Platform";
    Course(int id, String name, double price) {
        this.id = id;
        this.name = toTitleCase(name);
        this.price = price;
    }
    double getFinalPrice() {
        return price;
    }
    String toTitleCase(String str) {
        String[] words = str.toLowerCase().split(" ");
        String result = "";
        for (String w : words) {
            result += Character.toUpperCase(w.charAt(0)) + w.substring(1) + " ";
        }
        return result.trim();
    }
    void display() {
        System.out.println("Platform: " + platformName);
        System.out.println("Course ID: " + id);
        System.out.println("Course Name: " + name);
        System.out.println("Final Price: " + getFinalPrice());
    }
}
class RecordedCourse extends Course {
    RecordedCourse(int id, String name, double price) {
        super(id, name, price);
    }
    double getFinalPrice() {
        return price - (price * 0.10);
    }
}
class LiveCourse extends Course {
    LiveCourse(int id, String name, double price) {
        super(id, name, price);
    }
    double getFinalPrice() {
        return price - (price * 0.05);
    }
}
public class LearningApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter type (1-Recorded, 2-Live): ");
        int ch = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter course id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter course name: ");
        String name = sc.nextLine();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        Course c = null;
        if (ch == 1) c = new RecordedCourse(id, name, price);
        else if (ch == 2) c = new LiveCourse(id, name, price);
        else {
            System.out.println("Invalid choice");
            return;
        }
        c.display();
        sc.close();
    }
}