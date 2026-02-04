import java.util.Scanner;

public class Factors_Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int idx = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                if(idx==maxFactor){
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    for(int j=0; j<factors.length; j++) temp[j] = factors[j];
                    factors = temp;
                }
                factors[idx] = i;
                idx++;
            }
        }
        System.out.println("Factors of "+n+" are :- ");
        for(int i=0; i<idx; i++) System.out.print(factors[i]+" ");
        sc.close();
    }
}