import java.util.Scanner;

public class Count_Digits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int count = 0;
        if(n==0) count = 1;
        else{
            while(n!=0){
                n /= 10;
                count++;
            }
        }
        System.out.println("Total digits : "+count);
    }
}
