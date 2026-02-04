import java.util.Scanner;

public class Find_Bonus_For_Employees {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[][] empData = new double[10][2];
        double[][] res = new double[10][2];
        double totalBo = 0;
        double totalOldSal = 0;
        double totalNewSal = 0;
        for(int i=0; i<10; i++){
            System.out.println("Employee "+ (i+1));
            System.out.print("Enter salary : ");
            double sal = sc.nextDouble();
            System.out.print("Enter years of service : ");
            int years = sc.nextInt();
            if(sal<=0 || years<0){
                System.out.println("Invalid input. Enter again.\n");
                i--;
                continue;
            }
            empData[i][0] = sal;
            empData[i][1] = years;
        }
        for(int i=0; i<10; i++){
            double salary = empData[i][0];
            int years = (int)empData[i][1];
            double bonus;
            if(years>5) bonus = salary*0.05;
            else bonus = salary*0.02;
            double newSalary = salary+bonus;
            res[i][0] = bonus;
            res[i][1] = newSalary;
            totalBo += bonus;
            totalOldSal += salary;
            totalNewSal += newSalary;
        }
        System.out.println("Total bonus : "+totalBo);
        System.out.println("Total old salary : "+totalOldSal);
        System.out.println("Total new salary : "+totalNewSal);
        sc.close();
    }
}