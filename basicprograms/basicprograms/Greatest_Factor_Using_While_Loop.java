import java.util.Scanner;

public class Greatest_Factor_Using_While_Loop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int great_f = 1;
        int i = n-1;
        while(i>=1){
            if(n%i==0){
                great_f = i;
                break;
            }
            i--;
        }
        System.out.println("Greatest factor is "+great_f);
    }
}
