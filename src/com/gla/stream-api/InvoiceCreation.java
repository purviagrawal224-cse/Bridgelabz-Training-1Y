package Lambda;
import java.util.*;
class I {
    int id;
    I(int id) {
        this.id = id;
    }
    void show() {
        System.out.println("Invoice ID: " + id);
    }
}
public class InvoiceCreation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> l = new ArrayList<>();
        System.out.println("Enter number of transactions:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter transaction id:");
            int id = sc.nextInt();
            l.add(id);
        }
        List<I> li = new ArrayList<>();
        l.stream()
         .map(I::new)
         .forEach(li::add);
        for (I i : li) i.show();
        sc.close();
    }
}