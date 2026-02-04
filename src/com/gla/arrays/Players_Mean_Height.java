import java.util.Scanner;

public class Players_Mean_Height {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0.0;
        System.out.println("Enter height of 11 football players : ");
        for(int i=0; i<11; i++) heights[i] = sc.nextDouble();
        for(int i=0; i<11; i++) sum += heights[i];
        double mean = sum/11;
        System.out.println("Mean height of the football team is "+mean);
        sc.close();
    }
}