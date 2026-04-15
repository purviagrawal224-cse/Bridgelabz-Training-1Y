package Lambda;

import java.util.*;
public class TransformNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> l = new ArrayList<>();
        System.out.println("Enter number of customers:");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name:");
            String s = sc.nextLine();
            l.add(s);
        }
        l.stream()
         .map(String::toUpperCase)
         .sorted()
         .forEach(System.out::println);
        sc.close();
    }
}