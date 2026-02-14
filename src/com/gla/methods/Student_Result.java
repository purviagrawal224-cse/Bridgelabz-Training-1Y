import java.util.Scanner;
public class Student_Result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students : ");
        int n = sc.nextInt();
        int[][] marks = generateMarks(n);
        double[][] result = calculateResult(marks);
        display(marks, result);
        sc.close();
    }
    public static int[][] generateMarks(int n) {
        int[][] arr = new int[n][3];
        for(int i = 0; i < n; i++) {
            arr[i][0] = 10 + (int)(Math.random() * 90);
            arr[i][1] = 10 + (int)(Math.random() * 90);
            arr[i][2] = 10 + (int)(Math.random() * 90);
        }
        return arr;
    }
    public static double[][] calculateResult(int[][] marks) {
        int n = marks.length;
        double[][] res = new double[n][3];
        for(int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;
            avg = Math.round(avg * 100.0) / 100.0;
            percent = Math.round(percent * 100.0) / 100.0;
            res[i][0] = total;
            res[i][1] = avg;
            res[i][2] = percent;
        }
        return res;
    }
    public static void display(int[][] marks, double[][] result) {
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPercent");
        for(int i = 0; i < marks.length; i++) {
            System.out.println(marks[i][0] + "\t" + marks[i][1] + "\t" + marks[i][2] + "\t" + result[i][0] + "\t" + result[i][1] + "\t" + result[i][2]);
        }
    }
}
