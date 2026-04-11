import java.util.*;
abstract class CourseType {
    abstract String type();
}
class ExamCourse extends CourseType {
    String type() {
        return "Exam-Based";
    }
}
class AssignmentCourse extends CourseType {
    String type() {
        return "Assignment-Based";
    }
}
class ResearchCourse extends CourseType {
    String type() {
        return "Research-Based";
    }
}
class Course<T extends CourseType> {
    T c;
    Course(T c) {
        this.c = c;
    }
    void show() {
        System.out.println("Course Type: " + c.type());
    }
}
public class CourseManagement {
    static <T extends CourseType> void addCourse(T c) {
        Course<T> course = new Course<>(c);
        course.show();
    }
    static void displayAll(List<? extends CourseType> list) {
        for (CourseType c : list) System.out.println("Available: " + c.type());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<CourseType> list = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int ch = sc.nextInt();
            if (ch == 1) list.add(new ExamCourse());
            else if (ch == 2) list.add(new AssignmentCourse());
            else if (ch == 3) list.add(new ResearchCourse());
        }
        for (CourseType c : list) addCourse(c);
        displayAll(list);
    }
}
