import java.util.Scanner;

public class Array_Elements_Sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        double total = 0.0;
        int idx = 0;
        while(true){
            System.out.print("Enter number : ");
            if(idx==10) break;
            double n = sc.nextDouble();
            if(n<=0) break;
            arr[idx] = n;
            idx++;
        }
        for(int i=0; i<idx; i++){
            System.out.println("Number : "+arr[i]);
            total += arr[i];
        }
        System.out.println("Sum of all numbers is "+total);
        sc.close();
    }
}