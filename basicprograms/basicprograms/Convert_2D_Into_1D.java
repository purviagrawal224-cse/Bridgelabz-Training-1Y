import java.util.Scanner;

public class Convert_2D_Into_1D {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row : ");
        int m = sc.nextInt();
        System.out.print("Enter coloumn : ");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Enter elements : ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int[] brr = new int[n*m];
        int idx = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                brr[idx] = arr[i][j];
                idx++;
            }
        }
        System.out.println("1D Array elements : ");
        for(int i=0; i<brr.length; i++) System.out.println(brr[i]+" ");
        sc.close();
    }
}
