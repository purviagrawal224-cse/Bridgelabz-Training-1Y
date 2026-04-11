import java.util.*;
public class RotateList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) list.add(sc.nextInt());
        int k = sc.nextInt();
        k = k % n;
        List<Integer> res = new ArrayList<>();
        for (int i = k; i < n; i++) res.add(list.get(i));
        for (int i = 0; i < k; i++) res.add(list.get(i));
        System.out.println(res);
    }
}
