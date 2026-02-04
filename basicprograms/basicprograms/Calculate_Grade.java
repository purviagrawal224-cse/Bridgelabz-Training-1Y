import java.util.Scanner;

public class Calculate_Grade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Physics marks : ");
        int p = sc.nextInt();
        System.out.print("Enter Chemistry marks : ");
        int c = sc.nextInt();
        System.out.print("Enter Maths marks : ");
        int m = sc.nextInt();
        double avg = (p+c+m)/3.0;
        System.out.println("Average marks : "+avg);
        if(avg>=80){
            System.out.println("Grade : A");
            System.out.println("Remarks : Level 4, above agency-normalized standards");
        }
        else if(avg>=70){
            System.out.println("Grade : B");
            System.out.println("Remarks : Level 3, at agency-normalized standards");
        }
        else if(avg>=60){
            System.out.println("Grade : C");
            System.out.println("Remarks : Level 2, below but approaching standards");
        }
        else if(avg>=50){
            System.out.println("Grade : D");
            System.out.println("Remarks : Level 1, well belows standards");
        }
        else if(avg>=40){
            System.out.println("Grade : E");
            System.out.println("Remarks : Level -1, too belows standards");
        }
        else{
            System.out.println("Grade : R");
            System.out.println("Remarks : Remedial standards");
        }
    }
}
