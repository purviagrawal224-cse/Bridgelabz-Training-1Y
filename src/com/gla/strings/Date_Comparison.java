import java.time.LocalDate;
import java.util.Scanner;
public class Date_Comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first date : ");
        LocalDate d1 = LocalDate.parse(sc.nextLine());
        System.out.print("Enter second date : ");
        LocalDate d2 = LocalDate.parse(sc.nextLine());
        if (d1.isBefore(d2)) System.out.println("First date is before second date");
        else if (d1.isAfter(d2)) System.out.println("First date is after second date");
        else System.out.println("Both dates are the same");
        sc.close();
    }
}