import java.util.*;
interface Category {
    String getCategory();
}
class BookCategory implements Category {
    public String getCategory() {
        return "Books";
    }
}
class ClothingCategory implements Category {
    public String getCategory() {
        return "Clothing";
    }
}
class GadgetCategory implements Category {
    public String getCategory() {
        return "Gadgets";
    }
}
class Product<T extends Category> {
    String name;
    double price;
    T cat;
    Product(String name, double price, T cat) {
        this.name = name;
        this.price = price;
        this.cat = cat;
    }
    void show() {
        System.out.println(name + " " + cat.getCategory() + " " + price);
    }
}
public class OnlineMarketplace {
    static <T extends Product<?>> void applyDiscount(T p, double per) {
        p.price = p.price - (p.price * per / 100);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product<?>> list = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            int ch = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            sc.nextLine();
            if (ch == 1) list.add(new Product<>(name, price, new BookCategory()));
            else if (ch == 2) list.add(new Product<>(name, price, new ClothingCategory()));
            else if (ch == 3) list.add(new Product<>(name, price, new GadgetCategory()));
        }
        double discount = sc.nextDouble();
        for (Product<?> p : list) {applyDiscount(p, discount);
        for (Product<?> p : list) p.show();
    }
}
