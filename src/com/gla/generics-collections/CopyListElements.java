import java.util.*;
public class CopyListElements {
    static void copyList(List<? super Number> dest, List<? extends Number> src) {
        for (Number n : src) dest.add(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> src = new ArrayList<>();
        List<Number> dest = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) src.add(sc.nextInt());
        copyList(dest, src);
        for (Number x : dest) System.out.print(x + " ");
    }
}
