import java.util.*;
public class EmployeeSalaryDirectory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Double> map = new HashMap<>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++) {
            String name = sc.nextLine();
            double sal = sc.nextDouble();
            sc.nextLine();
            map.put(name, sal);
        }
        int ops = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < ops; i++){
            String name = sc.nextLine();
            double per = sc.nextDouble();
            sc.nextLine();
            if(map.containsKey(name)){
                double s = map.get(name);
                s = s + (s * per / 100);
                map.put(name, s);
            }
	    else System.out.println("Employee not found");
        }
        double sum = 0;
        for (double v : map.values()) sum += v;
        double avg = sum / map.size();
        System.out.println(avg);

        double max = 0;
        for (double v : map.values()) {
            if (v > max) max = v;
        }
        for (String k : map.keySet()) {
            if (map.get(k) == max) System.out.println(k);
        }
    }
}