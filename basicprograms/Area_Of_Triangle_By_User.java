import java.util.Scanner;

public class Area_Of_Triangle_By_User {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter base : ");
        double base = in.nextDouble();
        System.out.print("Enter height : ");
        double height = in.nextDouble();

        double area = 0.5 * base * height;

        double areaCm = area * 6.4516;

        System.out.print("The area of the triangle in square inches is " + area );
        System.out.print(" and the area of the triangle in square centimeters is " + areaCm);
    }
}
