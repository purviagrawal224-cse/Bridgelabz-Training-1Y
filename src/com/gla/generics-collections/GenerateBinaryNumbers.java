import java.util.*;
public class GenerateBinaryNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        Queue<String> q = new LinkedList<>();
        q.add("1");
        for (int i = 0; i < n; i++) {
            String cur = q.remove();
            System.out.print(cur + " ");
            q.add(cur + "0");
            q.add(cur + "1");
        }
    }
}
