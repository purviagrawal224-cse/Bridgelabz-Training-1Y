import java.util.Scanner;
class Account {
    int accNo;
    double bal;
    static String bankName = "National Bank";
    Account(int accNo, double bal) {
        this.accNo = accNo;
        this.bal = bal;
    }
    double calculateInterest() {
        return 0;
    }
}
class SavingsAccount extends Account {
    SavingsAccount(int accNo, double bal) {
        super(accNo, bal);
    }
    double calculateInterest() {
        return bal * 0.04;
    }
}
class CurrentAccount extends Account {
    CurrentAccount(int accNo, double bal) {
        super(accNo, bal);
    }
    double calculateInterest() {
        return bal * 0.02;
    }
}
public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter type (1-Savings, 2-Current): ");
        int ch = sc.nextInt();
        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();
        System.out.print("Enter balance: ");
        double bal = sc.nextDouble();
        Account a = null;
        if (ch == 1) a = new SavingsAccount(accNo, bal);
        else if (ch == 2) a = new CurrentAccount(accNo, bal);
        else {
            System.out.println("Invalid choice");
            return;
        }
        System.out.println("Bank: " + Account.bankName);
        System.out.println("Interest: " + a.calculateInterest());
        sc.close();
    }
}