import java.util.*;
public class StackUsingQueues {
    static class MyStack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        void push(int x) {
            q2.add(x);
            while (!q1.isEmpty()) {
                q2.add(q1.remove());
            }
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
        }
        int pop() {
            if (q1.isEmpty()) return -1;
            return q1.remove();
        }
        int top() {
            if (q1.isEmpty()) return -1;
            return q1.peek();
        }
        boolean isEmpty() {
            return q1.isEmpty();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyStack st = new MyStack();
        System.out.print("Enter number of operations: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int type = sc.nextInt();
            if (type == 1) {
                int x = sc.nextInt();
                st.push(x);
            } 
            else if (type == 2) System.out.println("Popped: " + st.pop());
            else if (type == 3) System.out.println("Top: " + st.top());
        }
    }
}
