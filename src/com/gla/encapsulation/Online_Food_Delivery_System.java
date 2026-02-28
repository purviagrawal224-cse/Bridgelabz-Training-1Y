import java.util.*;
abstract class FoodItem {
    private String nm;
    private double pr;
    private int qty;
    FoodItem(String nm, double pr, int qty) {
        this.nm = nm;
        this.pr = pr;
        this.qty = qty;
    }
    public String getNm() { return nm; }
    public double getPr() { return pr; }
    public int getQty() { return qty; }
    public abstract double calTotal();
    public void getItemDetails() {
        System.out.println("Item : " + nm);
        System.out.println("Price: " + pr);
        System.out.println("Qty  : " + qty);
    }
}
interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}
class VegItem extends FoodItem implements Discountable {
    VegItem(String nm, double pr, int qty) {
        super(nm, pr, qty);
    }
    public double calTotal() {
        return getPr() * getQty();
    }
    public double applyDiscount() {
        return calTotal() * 0.10;
    }
    public String getDiscountDetails() {
        return "10% Veg Discount";
    }
}
class NonVegItem extends FoodItem implements Discountable {
    NonVegItem(String nm, double pr, int qty) {
        super(nm, pr, qty);
    }
    public double calTotal() {
        return (getPr() * getQty()) + 50;
    }
    public double applyDiscount() {
        return calTotal() * 0.05;
    }
    public String getDiscountDetails() {
        return "5% Non-Veg Discount";
    }
}
public class Online_Food_Delivery_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<FoodItem> list = new ArrayList<>();
        System.out.print("Enter total items : ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("1.Veg  2.NonVeg");
            int ch = sc.nextInt();
            sc.nextLine();
            System.out.print("Item Name : ");
            String nm = sc.nextLine();
            System.out.print("Price : ");
            double pr = sc.nextDouble();
            System.out.print("Quantity : ");
            int qty = sc.nextInt();
            sc.nextLine();
            FoodItem f;
            if(ch == 1) f = new VegItem(nm, pr, qty);
            else f = new NonVegItem(nm, pr, qty);
            list.add(f);
        }
        System.out.println("\n--- Order Details ---");
        for (FoodItem f : list) {
            f.getItemDetails();
            double total = f.calTotal();
            if (f instanceof Discountable) {
                Discountable d = (Discountable) f;
                double dis = d.applyDiscount();
                System.out.println("Total : " + total);
                System.out.println("Discount : " + dis);
                System.out.println("Final Amount : " + (total - dis));
                System.out.println(d.getDiscountDetails());
            }
            System.out.println("---");
        }
        sc.close();
    }
}
