import java.util.*;
class Employee {
    String name;
    String dept;
    Employee(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }
    public String toString() {
        return name;
    }
}
public class GroupByDepartment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String dept = sc.nextLine();
            list.add(new Employee(name, dept));
        }
        Map<String, List<Employee>> map = new HashMap<>();
        for (Employee e : list) {
            map.putIfAbsent(e.dept, new ArrayList<>());
            map.get(e.dept).add(e);
        }
        for (Map.Entry<String, List<Employee>> e : map.entrySet())  System.out.println(e.getKey() + ": " + e.getValue());
    }
}
