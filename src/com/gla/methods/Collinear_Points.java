import java.util.Scanner;
public class Collinear_Points {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1 y1 : ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter x2 y2 : ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println("Enter x3 y3 : ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        System.out.println(isCollinearSlope(x1,y1,x2,y2,x3,y3));
        System.out.println(isCollinearArea(x1,y1,x2,y2,x3,y3));
        sc.close();
    }
    public static boolean isCollinearSlope(int x1,int y1, int x2,int y2, int x3,int y3) {
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
    }
    public static boolean isCollinearArea(int x1,int y1, int x2,int y2, int x3,int y3) {
        int value = x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2);
        return value == 0;
    }
}
