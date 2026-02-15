import java.util.Scanner;
class Book_2 {
    public String i;
    protected String t;
    private String a;
    Book_2(String i, String t, String a) {
        this.i = i;
        this.t = t;
        this.a = a;
    }
    public String getA() {
        return a;
    }
    public void setA(String a) {
        this.a = a;
    }
}
class EBook_2 extends Book_2 {
    EBook_2(String i, String t, String a) {
        super(i, t, a);
    }
    void show() {
        System.out.println(i);
        System.out.println(t);
        System.out.println(getA());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String i = sc.nextLine();
        String t = sc.nextLine();
        String a = sc.nextLine();
        EBook_2 e = new EBook_2(i, t, a);
        e.show();
        sc.close();
    }
}
