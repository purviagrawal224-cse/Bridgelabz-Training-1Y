import java.util.Scanner;
public class BMI {
    public static void calculate(double[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            double h = arr[i][1] / 100.0;
            double bmi = arr[i][0] / (h * h);
            arr[i][2] = bmi;
        }
    }
    public static String check(double bmi) {
        if(bmi < 18.5) return "Underweight";
        else if(bmi < 25) return "Normal";
        else if(bmi < 40) return "Overweight";
        else return "Obese";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] arr = new double[10][3];
        for(int i = 0; i < arr.length; i++) {
            System.out.print("Enter weight: ");
            arr[i][0] = sc.nextDouble();
            System.out.print("Enter height: ");
            arr[i][1] = sc.nextDouble();
        }
        calculate(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.println("BMI: " + arr[i][2]);
            System.out.println("Status: " + check(arr[i][2]));
        }
        sc.close();
    }
}