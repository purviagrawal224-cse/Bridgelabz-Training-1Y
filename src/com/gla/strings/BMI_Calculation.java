import java.util.Scanner;
public class BMI_Calculation {
    public static String[][] findBMIAndStatus(double[][] data) {
        String[][] res = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            double w = data[i][0];
            double h = data[i][1] / 100;
            double bmi = w / (h * h);
            bmi = Math.round(bmi * 100.0) / 100.0;
            String status;
            if (bmi <= 18.4) status = "Underweight";
            else if (bmi <= 24.9) status = "Normal";
            else if (bmi <= 39.9) status = "Overweight";
            else status = "Obese";
            res[i][0] = String.valueOf(data[i][1]);
            res[i][1] = String.valueOf(w);
            res[i][2] = String.valueOf(bmi);
            res[i][3] = status;
        }
        return res;
    }
    public static void display(String[][] res) {
        System.out.println("Height(cm)\tWeight(kg)\tBMI\tStatus");
        for (int i = 0; i < res.length; i++) System.out.println(res[i][0] + "\t\t" + res[i][1] + "\t\t" + res[i][2] + "\t" + res[i][3]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }
        String[][] res = findBMIAndStatus(data);
        display(res);
        sc.close();
    }
}
