import java.util.*;
class Question {
    String text;
    Question(String text) {
        this.text = text;
    }
    public String toString() {
        return text;
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
public class OnlineExaminationManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Question> questions = new ArrayList<>();
        Set<String> studentIds = new HashSet<>();
        Queue<Student> queue = new LinkedList<>();
        Stack<Question> stack = new Stack<>();
        System.out.print("Enter number of questions: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String q = sc.nextLine();
            questions.add(new Question(q));
        }
        Collections.shuffle(questions);
        System.out.print("Enter number of students: ");
        int m = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < m; i++) {
            String id = sc.nextLine();
            if (!studentIds.add(id)) {
                System.out.println("Duplicate student ignored: " + id);
                continue;
            }
            queue.add(new Student(id));
        }
        System.out.println("Starting Exam:");
        while (!queue.isEmpty()) {
            Student s = queue.remove();
            System.out.println("Student: " + s);
            for (Question q : questions) {
                System.out.println("Q: " + q);
                stack.push(q);
                System.out.println("Go back? (yes/no)");
                String ans = sc.nextLine();
                if (ans.equalsIgnoreCase("yes") && stack.size() > 1) {
                    stack.pop();
                    System.out.println("Back to: " + stack.peek());
                }
            }
            stack.clear();
        }
    }
}
