import java.util.Scanner;
import java.util.Random;
public class Student_Grade_Calculation {
    public static int[][] generateScores(int n) {
        Random rd = new Random();
        int[][] pcm = new int[n][3];
        for (int i = 0; i < n; i++) {
            pcm[i][0] = rd.nextInt(90) + 10;
            pcm[i][1] = rd.nextInt(90) + 10;
            pcm[i][2] = rd.nextInt(90) + 10;
        }
        return pcm;
    }
    public static double[][] calculateResult(int[][] pcm) {
        double[][] res = new double[pcm.length][3];
        for (int i = 0; i < pcm.length; i++) {
            double total = pcm[i][0] + pcm[i][1] + pcm[i][2];
            double avg = total / 3;
            double per = (total / 300) * 100;
            res[i][0] = Math.round(total * 100.0) / 100.0;
            res[i][1] = Math.round(avg * 100.0) / 100.0;
            res[i][2] = Math.round(per * 100.0) / 100.0;
        }
        return res;
    }
    public static String[] calculate_Grade(double[][] res) {
        String[] grade = new String[res.length];
        for (int i = 0; i < res.length; i++) {
            double per = res[i][2];
            if (per >= 80) grade[i] = "A";
            else if (per >= 70) grade[i] = "B";
            else if (per >= 60) grade[i] = "C";
            else if (per >= 50) grade[i] = "D";
            else if (per >= 40) grade[i] = "E";
            else grade[i] = "R";
        }
        return grade;
    }
    public static void display_Scorecard(int[][] pcm, double[][] res, String[] grade) {
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\t%\tGrade");

        for (int i = 0; i < pcm.length; i++) {
            System.out.println(
                    pcm[i][0] + "\t" +
                            pcm[i][1] + "\t" +
                            pcm[i][2] + "\t" +
                            res[i][0] + "\t" +
                            res[i][1] + "\t" +
                            res[i][2] + "\t" +
                            grade[i]
            );
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] pcm = generateScores(n);
        double[][] res = calculateResult(pcm);
        String[] grade = calculate_Grade(res);
        display_Scorecard(pcm, res, grade);
    }
}
