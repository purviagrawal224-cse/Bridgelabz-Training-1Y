import java.util.Scanner;
public class Bank_Acc {
    String n;
    int a;
    double b;
    void input(Scanner sc) {
        System.out.print("Enter Name: ");
        n = sc.nextLine();
        System.out.print("Enter Account No: ");
        a = sc.nextInt();
        System.out.print("Enter Balance: ");
        b = sc.nextDouble();
    }
    void dep(double amt) {
        b += amt;
    }
    void wd(double amt) {
        if (amt <= b) b -= amt;
        else System.out.println("Insufficient Balance");
    } 
    void display() {
        System.out.println("Current Balance: " + b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank_Acc ba = new Bank_Acc();
        ba.input(sc);
        System.out.print("Deposit Amount: ");
        ba.dep(sc.nextDouble());
        System.out.print("Withdraw Amount: ");
        ba.wd(sc.nextDouble());
        ba.display();
        sc.close();
    }
}
