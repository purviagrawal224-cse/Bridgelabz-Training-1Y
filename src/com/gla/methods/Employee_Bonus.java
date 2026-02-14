import java.util.Scanner;
public class Employee_Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of employees : ");
        int n = sc.nextInt();
        int[][] data = generateSalaryAndService(n);
        double[][] newData = calculateBonus(data);
        display(data, newData);
        sc.close();
    }
    public static int[][] generateSalaryAndService(int n) {
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++) {
            arr[i][0] = 10000 + (int)(Math.random() * 90000);
            arr[i][1] = 1 + (int)(Math.random() * 10);
        }
        return arr;
    }
    public static double[][] calculateBonus(int[][] arr) {
        int n = arr.length;
        double[][] res = new double[n][2];
        for(int i = 0; i < n; i++) {
            double salary = arr[i][0];
            int years = arr[i][1];
            double bonus;
            if(years > 5) bonus = salary * 0.05;
            else bonus = salary * 0.02;
            res[i][0] = salary + bonus;
            res[i][1] = bonus;
        }
        return res;
    }
    public static void display(int[][] oldData, double[][] newData) {
        double totalOld = 0;
        double totalNew = 0;
        double totalBonus = 0;
        System.out.println("OldSalary\tYears\tBonus\tNewSalary");
        for(int i = 0; i < oldData.length; i++) {
            double oldSalary = oldData[i][0];
            int years = oldData[i][1];
            double bonus = newData[i][1];
            double newSalary = newData[i][0];
            totalOld += oldSalary;
            totalNew += newSalary;
            totalBonus += bonus;
            System.out.println(oldSalary + "\t" + years + "\t" + bonus + "\t" + newSalary);
        }
        System.out.println("\nTotal Old Salary: " + totalOld);
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total New Salary: " + totalNew);
    }
}
