import java.util.Scanner;

public class Odd_Even_Numbers_Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] even = new int[n];
        int[] odd = new int[n];
        int evenIdx = 0, oddIdx = 0;
        System.out.println("Enter elements : ");
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        for(int i=0; i<n; i++){
            if(arr[i]%2==0){
                even[evenIdx] = arr[i];
                evenIdx++;
            }
            else{
                odd[oddIdx] = arr[i];
                oddIdx++;
            }
        }
        System.out.println("Even numbers : ");
        for(int i=0; i<evenIdx; i++) System.out.print(even[i]+" ");
        System.out.println();
        System.out.println("Odd numbers : ");
        for(int i=0; i<oddIdx; i++) System.out.print(odd[i]+" ");
        sc.close();
    }
}