import java.util.*;
public class CopyListElements {
    static void copyList(List<? super Number> dest, List<? extends Number> src) {
        for (Number n : src) dest.add(n);
    }
    public static void main(String[] args) {
        List<Integer> src = new ArrayList<>();
        src.add(10);
        src.add(20);
        src.add(30);
        List<Number> dest = new ArrayList<>();
        copyList(dest, src);
        System.out.println(dest);
    }
}
