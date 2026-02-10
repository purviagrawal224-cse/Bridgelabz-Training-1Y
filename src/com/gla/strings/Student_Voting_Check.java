import java.util.Scanner;
public class Student_Voting_Check {
    public static int[] input_Ages(Scanner sc, int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) ages[i] = sc.nextInt();
        return ages;
    }
    public static String[][] check_Voting(int[] ages) {
        String[][] res = new String[ages.length][2];
        for(int i = 0; i < ages.length; i++) {
            res[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) res[i][1] = "Cannot Vote";
            else if (ages[i] >= 18) res[i][1] = "Can Vote";
            else res[i][1] = "Cannot Vote";
        }
        return res;
    }
    public static void display_Table(String[][] data) {
        System.out.println("Age\tStatus");
        for (int i = 0; i < data.length; i++) System.out.println(data[i][0] + "\t" + data[i][1]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        System.out.println("Enter ages:");
        int[] ages = input_Ages(sc, n);
        String[][] res = check_Voting(ages);
        display_Table(res);
    }
}
