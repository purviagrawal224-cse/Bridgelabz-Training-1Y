import java.util.*;
class StackUsingQueues<T> {
    Queue<T> q1 = new LinkedList<>();
    Queue<T> q2 = new LinkedList<>();
    void push(T x) {
        q2.add(x);
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        Queue<T> temp = q1;
        q1 = q2;
        q2 = temp;
    }
    T pop() {
        return q1.remove();
    }
    T top() {
        return q1.peek();
    }
}
public class StackUsingQueues {
    public static void main(String[] args) {
        StackUsingQueues<Integer> s = new StackUsingQueues<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.pop());
    }
}