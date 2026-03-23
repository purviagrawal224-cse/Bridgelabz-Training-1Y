import java.util.*;
class IBE extends Exception {
    IBE(String m){
        super(m);
    }
}
public class B {
    static double b;
    static void w(double a) throws IBE {
        if(a < 0){
            throw new IllegalArgumentException();
        }
        if(a > b){
            throw new IBE("x");
        }
        b = b - a;
        System.out.println("Withdrawal successful, new balance: " + b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter balance: ");
        b = sc.nextDouble();
        try {
            System.out.print("Enter amount to withdraw: ");
            double a = sc.nextDouble();
            w(a);
        }
        catch(IBE e){
            System.out.println("Insufficient balance!");
        }
        catch(IllegalArgumentException e){
            System.out.println("Invalid amount!");
        }
    }
}