import java.util.Scanner;

public class BMI_Of_Person {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight(Kg) : ");
        double w = sc.nextDouble();
        System.out.print("Enter height(cm) : ");
        double h_cm = sc.nextDouble();
        double h_m = h_cm/100;
        double bmi = w/(h_m*h_m);
        System.out.println("BMI is "+bmi);
        if(bmi<=18.4) System.out.println("Underweight");
        else if(bmi<=24.9) System.out.println("Normal");
        else if(bmi<=39.9) System.out.println("Overweight");
        else System.out.println("Obese");
    }
}
