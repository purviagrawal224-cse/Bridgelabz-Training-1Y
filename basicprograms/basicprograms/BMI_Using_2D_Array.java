import java.util.Scanner;

public class BMI_Using_2D_Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons : ");
        int n = sc.nextInt();
        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];
        for(int i=0; i<n; i++){
            System.out.println("\nPerson "+(i+1));
            System.out.print("Enter weight(Kg) : ");
            personData[i][0] = sc.nextDouble();
            System.out.print("Enter height(m) : ");
            personData[i][1] = sc.nextDouble();
            if(personData[i][0]<=0 || personData[i][1]<=0){
                System.out.println("Invalid input Enter again");
                i--;
                continue;
            }
        }
        for(int i=0; i<n; i++){
            double weight = personData[i][0];
            double height = personData[i][1];

            personData[i][2] = weight/(height*height);
            if(personData[i][2]<= 18.4) weightStatus[i] = "Underweight";
            else if(personData[i][2]<= 24.9) weightStatus[i] = "Normal";
            else if(personData[i][2]<=39.9) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }
        for(int i=0; i<n; i++){
            System.out.println("Person "+(i+1));
            System.out.println("Weight : "+personData[i][0]);
            System.out.println("Height : "+personData[i][1]);
            System.out.println("BMI : "+personData[i][2]);
            System.out.println("Status : "+ weightStatus[i]);
            System.out.println();
        }
        sc.close();
    }
}
