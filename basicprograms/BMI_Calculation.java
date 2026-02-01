import java.util.Scanner;

public class BMI_Calculation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons : ");
        int n = sc.nextInt();
        double[] h = new double[n];
        double[] w = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];
        for(int i=0; i<n; i++){
            System.out.println("\nPerson "+(i+1));
            System.out.print("Enter height(m) : ");
            h[i] = sc.nextDouble();
            System.out.print("Enter weight(Kg) : ");
            w[i] = sc.nextDouble();
            if(h[i]<=0 || w[i]<=0){
                System.out.println("Invalid input Enter again");
                i--;
                continue;
            }
        }
        for(int i=0; i<n; i++){
            bmi[i] = w[i]/(h[i]*h[i]);
            if(bmi[i]<= 18.4) status[i] = "Underweight";
            else if(bmi[i]<= 24.9) status[i] = "Normal";
            else if(bmi[i]<=39.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }
        for(int i=0; i<n; i++){
            System.out.println("Person "+(i+1));
            System.out.println("Height : "+h[i]);
            System.out.println("Weight : "+w[i]);
            System.out.println("BMI : "+bmi[i]);
            System.out.println("Status : "+status[i]);
            System.out.println();
        }
        sc.close();
    }
}
