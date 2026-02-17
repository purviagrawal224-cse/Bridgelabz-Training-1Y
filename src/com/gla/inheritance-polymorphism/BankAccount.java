import java.util.*;
class BankAccount {
    int an;
    double b;
    BankAccount(int an, double b) {
        this.an = an;
        this.b = b;
    }
    void display() {
        System.out.println("Account Number : " + an);
        System.out.println("Balance : " + b);
    }
}
class SavingsAccount extends BankAccount {
    double ir;
    SavingsAccount(int an, double b, double ir) {
        super(an, b);
        this.ir = ir;
    }
    void displayAccountType() {
        System.out.println("Account Type : Savings Account");
    }
    void display() {
        displayAccountType();
        super.display();
        System.out.println("Interest Rate : " +ir+"%");
        System.out.println();
    }
}
class CheckingAccount extends BankAccount {
    double wl;
    CheckingAccount(int an, double b, double wl) {
        super(an, b);
        this.wl = wl;
    }
    void displayAccountType() {
        System.out.println("Account Type : Checking Account");
    }
    void display() {
        displayAccountType();
        super.display();
        System.out.println("Withdrawal Limit : "+ wl);
        System.out.println();
    }
}
class FixedDepositAccount extends BankAccount {
    int t;
    FixedDepositAccount(int an, double b, int t) {
        super(an, b);
        this.t = t;
    }
    void displayAccountType() {
        System.out.println("Account Type : Fixed Deposit Account");
    }
    void display() {
        displayAccountType();
        super.display();
        System.out.println("Tenure (months) : "+t);
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of accounts : ");
        int n = sc.nextInt();
        sc.nextLine();
        BankAccount[] arr = new BankAccount[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Enter type (savings/checking/fixed) : ");
            String ty = sc.nextLine().toLowerCase();
            System.out.print("Enter account number : ");
            int an = sc.nextInt();
            System.out.print("Enter balance : ");
            double b = sc.nextDouble();
            if(ty.equals("savings")) {
                System.out.print("Enter interest rate : ");
                double ir = sc.nextDouble();
                arr[i] = new SavingsAccount(an, b, ir);
            }
            else if(ty.equals("checking")) {
                System.out.print("Enter withdrawal limit : ");
                double wl = sc.nextDouble();
                arr[i] = new CheckingAccount(an, b, wl);
            }
            else {
                System.out.print("Enter tenure (months) : ");
                int t = sc.nextInt();
                arr[i] = new FixedDepositAccount(an, b, t);
            }
            sc.nextLine();
        }
        System.out.println();
        for(int i = 0; i < n; i++) {
            arr[i].display();
        }
        sc.close();
    }
}
