import java.util.Scanner;

public class Greatest_Factor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int great_f = 1;
        for(int i=n-1; i>=1; i--){
            if(n%i==0){
                great_f = i;
                break;
            }
        }
        System.out.println("Greatest factor is "+great_f);
    }
}
