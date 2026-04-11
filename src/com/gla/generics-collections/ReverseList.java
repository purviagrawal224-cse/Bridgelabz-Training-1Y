import java.util.*;
public class ReverseList {
    static void revList(List<Integer> list) {
        int i = 0, j = list.size() - 1;
        while (i<j){
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        LinkedList<Integer> link = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr.add(x);
            link.add(x);
        }
        revList(arr);
        revList(link);
        System.out.println(arr);
        System.out.println(link);
    }
}
