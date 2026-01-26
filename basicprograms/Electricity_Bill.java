import java.util.Scanner;

public class Electricity_Bill {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter consumed units : ");
        int un = sc.nextInt();
        double bill = 0;
        if(un <=100) bill = un *1;
        else if(un <=200) bill = (100*1)+(un -100)*2;
        else bill = (100*1)+(100*2)+(un -200)*3;
        System.out.println("Total electricity bill is "+bill);
    }
}
