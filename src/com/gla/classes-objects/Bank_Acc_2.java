import java.util.Scanner;
class Bank_Acc_2 {
    public String ac;
    protected String h;
    private double b;
    Bank_Acc_2(String ac, String h, double b) {
        this.ac = ac;
        this.h = h;
        this.b = b;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
}
class Savings_Acc_2 extends Bank_Acc_2 {
    Savings_Acc_2(String ac, String h, double b) {
        super(ac, h, b);
    }
    void show() {
        System.out.println(ac);
        System.out.println(h);
        System.out.println(getB());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ac = sc.nextLine();
        String h = sc.nextLine();
        double b = sc.nextDouble();
        Savings_Acc_2 s = new Savings_Acc_2(ac, h, b);
        s.show();
        sc.close();
    }
}
