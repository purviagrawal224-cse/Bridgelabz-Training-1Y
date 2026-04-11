import java.util.*;
public class CustomerFeedbackAnalysis {
    public static void main(String[] args) {
        List<String> all = new ArrayList<>();
        all.add("Good service");
        all.add("Fast delivery");
        all.add("Good service");
        all.add("Nice app");
        Set<String> unique = new LinkedHashSet<>(all);
        Queue<String> q = new LinkedList<>(unique);
        Stack<String> st = new Stack<>();
        System.out.println("Processing Feedback:");
        while (!q.isEmpty()) {
            String s = q.remove();
            System.out.println("Processed: " + s);
            st.push(s);
        }
        System.out.println("Recent Feedbacks:");
        int k = 2;
        while (k-- > 0 && !st.isEmpty()) System.out.println(st.pop());
    }
}