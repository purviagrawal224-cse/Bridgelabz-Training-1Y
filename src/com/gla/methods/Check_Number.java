import java.util.Scanner;
public class Check_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = check(num);
        if(res==1) System.out.println("Positive");
        else if(res==-1) System.out.println("Negative");
        else System.out.println("Zero");
    }
    public static int check(int n) {
        if(n > 0) return 1;
        else if(n < 0) return -1;
        else return 0;
    }
}