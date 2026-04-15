package Lambda;
import java.util.*;
class P {
    int id;
    P(int id) {
        this.id = id;
    }

    int getId() {
        return id;
    }
}
public class PatientIDPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<P> l = new ArrayList<>();
        System.out.println("Enter number of patients:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter patient id:");
            int id = sc.nextInt();
            l.add(new P(id));
        }
        l.stream()
         .map(P::getId)
         .forEach(System.out::println);
        sc.close();
    }
}