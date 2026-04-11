import java.util.*;
public class RemoveDuplicatesPreserveOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) list.add(sc.nextInt());
        Set<Integer> set = new LinkedHashSet<>(list);
        list = new ArrayList<>(set);
        System.out.println(list);
    }
}
