import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
interface DateUtil {
    static String format(LocalDate d, int t) {
        DateTimeFormatter f;
        if (t == 1) f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        else if (t == 2) f = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        else f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return d.format(f);
    }
}
public class InvoiceDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1 DD-MM-YYYY, 2 MM/DD/YYYY, 3 YYYY-MM-DD: ");
        int c = sc.nextInt();
        LocalDate d = LocalDate.now();
        System.out.println("Formatted Date: " + DateUtil.format(d, c));
    }
}