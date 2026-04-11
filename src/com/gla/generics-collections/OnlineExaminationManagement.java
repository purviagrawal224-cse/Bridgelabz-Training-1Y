import java.util.*;
class Question {
    String q;
    Question(String q) {
        this.q = q;
    }
    public String toString() {
        return q;
    }
}
class Student {
    String id;
    Student(String id) {
        this.id = id;
    }
    public String toString() {
        return id;
    }
}
public class OnlineExaminationManagement {
    public static void main(String[] args) {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("Q1"));
        questions.add(new Question("Q2"));
        questions.add(new Question("Q3"));
        Collections.shuffle(questions);
        Set<String> students = new HashSet<>();
        students.add("S1");
        students.add("S2");
        students.add("S1");
        Queue<Student> q = new LinkedList<>();
        for (String id : students) q.add(new Student(id));
        System.out.println("Students in Queue:");
        while (!q.isEmpty()) System.out.println("Serving: " + q.remove());
        Stack<Question> st = new Stack<>();
        System.out.println("Navigating Questions:");
        for (Question x : questions) {
            System.out.println("Next: " + x);
            st.push(x);
        }
        System.out.println("Going Back:");
        while (!st.isEmpty()) System.out.println("Back: " + st.pop());
    }
}