import java.util.Scanner;
class Employee_Details_2 {
    public int id;
    protected String d;
    private double s;
    Employee_Details_2(int id, String d, double s) {
        this.id = id;
        this.d = d;
        this.s = s;
    }
    public double getS() {
        return s;
    }
    public void setS(double s) {
        this.s = s;
    }
}
class Manager_2 extends Employee_Details_2 {
    Manager_2(int id, String d, double s) {
        super(id, d, s);
    }
    void show() {
        System.out.println(id);
        System.out.println(d);
        System.out.println(getS());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        sc.nextLine();
        String d = sc.nextLine();
        double s = sc.nextDouble();
        Manager_2 m = new Manager_2(id, d, s);
        m.show();
        sc.close();
    }
}
