import java.util.Scanner;

public class Leap_Year_Using_Logical_Operators {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int y = sc.nextInt();
        if(y<1582) System.out.println("Year should be valid for 1582 or greater");
        else if((y%400==0) || (y%4==0) && (y%100!=0)) System.out.println(y+" is a leap year");
        else System.out.println(y+" is not a Leap Year");
    }
}
