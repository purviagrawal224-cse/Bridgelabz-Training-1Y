import java.util.*;
public class ArrayOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] a = null;
        if(n > 0){
            a = new int[n];
            System.out.println("Enter elements:");
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
        }
        try {
            System.out.print("Enter index: ");
            int i = sc.nextInt();
            int v = a[i];
            System.out.println("Value at index " + i + ": " + v);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index!");
        }
        catch(NullPointerException e){
            System.out.println("Array is not initialized!");
        }
    }
}