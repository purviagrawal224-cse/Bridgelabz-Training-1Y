import java.util.Scanner;

public class Area_Of_Triangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base : ");
        double base = input.nextDouble();
        System.out.print("Enter height : ");
        double height = input.nextDouble();

        double area = 0.5 * base * height;

        double areaCm = area * 6.4516;

        System.out.println("The area of the triangle in square inches is " + area+" and the area of the triangle in square centimeters is " + areaCm);
    }
}
