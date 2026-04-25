package Lambda;
import java.util.*;
public class NameUppercasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> l = new ArrayList<>();
        System.out.println("Enter number of employees:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name:");
            String s = sc.next();
            l.add(s);
        }
        l.stream()
         .map(String::toUpperCase)
         .forEach(System.out::println);
        sc.close();
    }
}