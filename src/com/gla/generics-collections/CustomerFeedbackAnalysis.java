import java.util.*;
public class CustomerFeedbackAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> all = new ArrayList<>();
        System.out.print("Enter number of feedbacks: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            all.add(s);
        }
        Set<String> unique = new LinkedHashSet<>(all);
        Queue<String> q = new LinkedList<>(unique);
        Stack<String> st = new Stack<>();
        System.out.println("Processing Feedback:");
        while (!q.isEmpty()) {
            String s = q.remove();
            System.out.println("Processed: " + s);
            st.push(s);
        }
        System.out.print("Enter how many recent feedbacks to show: ");
        int k = sc.nextInt();
        System.out.println("Recent Feedbacks:");
        while (k-- > 0 && !st.isEmpty()) System.out.println(st.pop());
    }
}
