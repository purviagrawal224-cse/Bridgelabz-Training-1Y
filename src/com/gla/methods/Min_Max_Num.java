import java.util.Scanner;
public class Min_Max_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int[] res = findSmallestAndLargest(n1, n2, n3);
        System.out.println("Smallest: "+res[0]);
        System.out.println("Largest: "+res[1]);
    }
    public static int[] findSmallestAndLargest(int num1, int num2, int num3) {
        int small = num1;
        int larg = num1;
        if(num2<small) small = num2;
        if(num3<small) small = num3;
        if(num2>larg) larg = num2;
        if(num3>larg) larg = num3;
        return new int[]{small,larg};
    }
}
