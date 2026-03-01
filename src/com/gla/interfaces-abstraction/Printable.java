import java.util.Scanner;
interface Print {
    void print();
}
interface Scan {
    void scan();
}
class Printer implements Print {
    public void print() {
        System.out.println("Printing...");
    }
}
class MultiMachine implements Print, Scan {
    public void print() {
        System.out.println("Printing...");
    }
    public void scan() {
        System.out.println("Scanning...");
    }
}
public class Printable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1 Printer, 2 MultiMachine: ");
        int t = sc.nextInt();
        System.out.print("1 Print, 2 Scan: ");
        int c = sc.nextInt();
        if (t == 1) {
            Printer p = new Printer();
            if (c == 1) p.print();
            else System.out.println("Not Supported");
        } 
        else if (t == 2) {
            MultiMachine m = new MultiMachine();
            if (c == 1) m.print();
            else if (c == 2) m.scan();
            else System.out.println("Invalid choice");
        } 
        else System.out.println("Invalid type");
    }
}