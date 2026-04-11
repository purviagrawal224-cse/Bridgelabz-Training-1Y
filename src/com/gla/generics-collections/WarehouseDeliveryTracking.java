import java.util.*;
class PackageItem {
    String id;
    PackageItem(String id) {
        this.id = id;
    }
    public String toString() {
        return id;
    }
}
public class WarehouseDeliveryTrackingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<PackageItem> pending = new LinkedList<>();
        Set<String> ids = new HashSet<>();
        List<PackageItem> delivered = new ArrayList<>();
        Stack<PackageItem> returned = new Stack<>();
        System.out.print("Enter number of packages: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            if (!ids.add(id)) {
                System.out.println("Duplicate ID ignored: " + id);
                continue;
            }
            pending.add(new PackageItem(id));
        }
        System.out.println("Processing Deliveries:");
        while (!pending.isEmpty()) {
            PackageItem p = pending.remove();
            System.out.println("Deliver " + p + "? (yes/no)");
            String ans = sc.nextLine();

            if (ans.equalsIgnoreCase("yes")) delivered.add(p);
            else returned.push(p);
        }
        System.out.println("Delivered Packages:");
        for (PackageItem p : delivered) System.out.println(p);
        System.out.println("Returned Packages:");
        while (!returned.isEmpty()) System.out.println(returned.pop());
    }
}
