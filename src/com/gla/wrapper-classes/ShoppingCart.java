import java.util.*;
public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int s = 0;
        for(int i = 0; i < n; i++){
            String x = sc.nextLine();
            try{
                int p = Integer.parseInt(x);
                s += p;
            } catch(Exception e){
                System.out.println("Invalid price: " + x);
            }
        }
        System.out.println("Total price = " + s);
    }
}