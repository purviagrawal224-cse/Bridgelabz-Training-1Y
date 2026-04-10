public class RouteTrackerSystem {
    public static void main(String[] args) {
        Driver driver = new Driver("D1204", "Kavita Nair");

        driver.routeHistory.addCheckpoint(new DeliveryCheckpoint("C1", "Warehouse A", 50.0, 60, 70)); // +10 min
        driver.routeHistory.addCheckpoint(new FuelCheckpoint("C2", "Pump 12", 20.0, 15, 15));         // On time
        driver.routeHistory.addCheckpoint(new RestCheckpoint("C3", "Motel X", 40.0, 60, 95));          // +35 min delay
        driver.routeHistory.addCheckpoint(new DeliveryCheckpoint("C4", "Client Hub", 10.0, 30, 45));   // +15 min

        System.out.println("Driver: " + driver.driverId + " – " + driver.name);
        System.out.println("Route Summary:");
        driver.routeHistory.printRoute();

        double totalDist = driver.routeHistory.computeTotalDistance();
        double totalPen = driver.routeHistory.computeTotalPenalty();
        System.out.printf("Total Distance: %.1f km\n", totalDist);
        System.out.printf("Total Penalty: %.1f\n", totalPen);
        System.out.printf("Route Score: %.1f\n", (totalDist - totalPen));
        System.out.println("Critical Route Check: " +
                (driver.routeHistory.checkCriticalPoints() ? "All required checkpoints present" : "Missing critical checkpoints"));
    }
}