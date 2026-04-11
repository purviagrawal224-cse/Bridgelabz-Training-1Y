import java.util.*;
public class LibraryCatalog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            int ch = sc.nextInt();
            sc.nextLine();
            if (ch == 1) {
                String isbn = sc.nextLine();
                String title = sc.nextLine();
                map.put(isbn, title);
            } 
            else if (ch == 2) {
                String isbn = sc.nextLine();
                if (map.containsKey(isbn)) System.out.println(map.get(isbn));
                else System.out.println("Book not found");
            } 
            else if (ch == 3) {
                String isbn = sc.nextLine();
                map.remove(isbn);
            } 
            else if (ch == 4) {
                TreeMap<String, String> tm = new TreeMap<>(map);
                for (String k : tm.keySet()) {
                    System.out.println(k + " " + tm.get(k));
                }
            } 
            else if (ch == 5) {
                String title = sc.nextLine();
                boolean f = false;
                for (String k : map.keySet()) {
                    if (map.get(k).equals(title)) {
                        System.out.println(k);
                        f = true;
                    }
                }
                if (!f) System.out.println("Book not found");
            }
        }
    }
}