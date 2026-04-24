import java.util.Scanner;

public class PCM_Marks_Grade_Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students : ");
        int n = sc.nextInt();
        double[] p = new double[n];
        double[] c = new double[n];
        double[] m = new double[n];
        double[] percentage = new double[n];
        char[] grade = new char[n];
        for(int i=0; i<n; i++){
            System.out.println("\nStudent "+(i+1));
            System.out.print("Enter Physics marks : ");
            p[i] = sc.nextDouble();
            System.out.print("Enter Chemistry marks : ");
            c[i] = sc.nextDouble();
            System.out.print("Enter Maths marks : ");
            m[i] = sc.nextDouble();
            if(p[i]<=0 || c[i]<=0 || m[i]<=0){
                System.out.println("Invalid marks Enter Positive values");
                i--;
                continue;
            }
        }
        for(int i=0; i<n; i++){
            percentage[i] = (p[i]+c[i]+m[i])/3.0;
            if(percentage[i]>=80) grade[i] = 'A';
            else if(percentage[i]>=70) grade[i] = 'B';
            else if(percentage[i]>=60) grade[i] = 'C';
            else if(percentage[i]>=50) grade[i] = 'D';
            else if(percentage[i]>=40) grade[i] = 'E';
            else grade[i] = 'R';
        }
        for(int i=0; i<n; i++){
            System.out.println("Physics "+p[i]);
            System.out.println("Chemistry : "+c[i]);
            System.out.println("Maths : "+m[i]);
            System.out.println("Percentage : "+percentage[i]);
            System.out.println("Grade : "+grade[i]);
            System.out.println();
        }
        sc.close();
    }
}