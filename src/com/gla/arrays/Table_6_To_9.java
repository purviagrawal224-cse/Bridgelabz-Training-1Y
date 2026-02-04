import java.util.Scanner;

public class Table_6_To_9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int[] table = new int[4];
        int idx = 0;
        for(int i=6; i<=9; i++){
            table[idx]=n*i;
            idx++;
        }
        idx = 0;
        for(int i = 6; i<=9; i++){
            System.out.println(n+" x "+i+" = "+table[idx]);
            idx++;
        }
        sc.close();
    }
}