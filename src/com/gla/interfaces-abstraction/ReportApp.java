import java.util.Scanner;
interface ReportExporter {
    void exportToCSV();
    void exportToPDF();
    default void exportToJSON() {
        System.out.println("Exporting report to JSON");
    }
}
class SalesReport implements ReportExporter {
    @Override
    public void exportToCSV() {
        System.out.println("Sales report exported to CSV");
    }
    @Override
    public void exportToPDF() {
        System.out.println("Sales report exported to PDF");
    }
}
class FinanceReport implements ReportExporter {
    @Override
    public void exportToCSV() {
        System.out.println("Finance report exported to CSV");
    }
    @Override
    public void exportToPDF() {
        System.out.println("Finance report exported to PDF");
    }
}
public class ReportApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1 Sales, 2 Finance: ");
        int t = sc.nextInt();
        System.out.print("1 CSV, 2 PDF, 3 JSON: ");
        int c = sc.nextInt();
        ReportExporter r = null;
        if (t == 1) r = new SalesReport();
        else if (t == 2) r = new FinanceReport();
        else {
            System.out.println("Invalid type");
            return;
        }
        if (c == 1) r.exportToCSV();
        else if (c == 2) r.exportToPDF();
        else if (c == 3) r.exportToJSON();
        else System.out.println("Invalid choice");
    }
}