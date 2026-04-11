import java.util.*;
abstract class CourseType {
    String n;
    CourseType(String n) {
        this.n = n;
    }
    void show() {
        System.out.println(n);
    }
}
class ExamCourse extends CourseType {
    ExamCourse(String n) {
        super(n);
    }
}
class AssignmentCourse extends CourseType {
    AssignmentCourse(String n) {
        super(n);
    }
}
class ResearchCourse extends CourseType {
    ResearchCourse(String n) {
        super(n);
    }
}
class Course<T extends CourseType> {
    ArrayList<T> l = new ArrayList<>();
    void addCourse(T x) {
        l.add(x);
    }
    void displayCourses() {
        for (T i : l) {
            i.show();
        }
    }
}
public class CourseManagement {
    static void displayAll(List<? extends CourseType> l) {
        for (CourseType x : l) {
            x.show();
        }
    }
    public static void main(String[] args) {
        Course<ExamCourse> e = new Course<>();
        e.addCourse(new ExamCourse("Math Exam"));
        e.addCourse(new ExamCourse("Physics Exam"));
        Course<AssignmentCourse> a = new Course<>();
        a.addCourse(new AssignmentCourse("Java Assignment"));
        a.addCourse(new AssignmentCourse("DBMS Assignment"));
        Course<ResearchCourse> r = new Course<>();
        r.addCourse(new ResearchCourse("AI Research"));
        r.addCourse(new ResearchCourse("ML Research"));
        System.out.println("Exam Courses:");
        e.displayCourses();
        System.out.println("Assignment Courses:");
        a.displayCourses();
        System.out.println("Research Courses:");
        r.displayCourses();
        System.out.println("Using Wildcard:");
        displayAll(Arrays.asList(
                new ExamCourse("Chemistry Exam"),
                new AssignmentCourse("OS Assignment"),
                new ResearchCourse("Data Science Research")
        ));
    }
}