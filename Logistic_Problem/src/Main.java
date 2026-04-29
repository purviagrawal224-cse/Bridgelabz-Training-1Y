import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Driver ID:");
        String driverId = sc.nextLine();
        System.out.println("Enter Driver Name:");
        String name = sc.nextLine();
        Driver d = new Driver(driverId, name);
        System.out.println("Enter number of checkpoints:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("\nCheckpoint " + (i + 1));
            System.out.println("Enter Type (Delivery/Fuel/Rest):");
            String type = sc.next();
            System.out.println("Enter Checkpoint ID:");
            String id = sc.next();
            sc.nextLine();
            System.out.println("Enter Location Name:");
            String location = sc.nextLine();
            System.out.println("Enter Distance from last (km):");
            double dist = sc.nextDouble();
            System.out.println("Enter Expected Duration (min):");
            int exp = sc.nextInt();
            System.out.println("Enter Actual Duration (min):");
            int act = sc.nextInt();
            Checkpoint cp;
            if (type.equalsIgnoreCase("Delivery")) {
                cp = new DeliveryCheckpoint(id, location, dist, exp, act);
            }
            else if (type.equalsIgnoreCase("Fuel")) {
                cp = new FuelCheckpoint(id, location, dist, exp, act);
            }
            else {
                cp = new RestCheckpoint(id, location, dist, exp, act);
            }
            d.routeHistory.addCheckpoint(cp);
        }
        try {
            DAO.saveDriver(d);

            RouteLinkedList<Checkpoint>.Node temp = d.routeHistory.head;
            while (temp != null) {
                DAO.saveCheckpoint(d.driverId, temp.data);
                temp = temp.next;
            }
            d.routeHistory = DAO.loadRoute(d.driverId);

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();
        d.printSummary();
    }
}