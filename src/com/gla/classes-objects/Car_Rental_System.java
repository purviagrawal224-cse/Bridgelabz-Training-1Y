import java.util.Scanner;
public class Car_Rental_System {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1000;
    double totalCost;
    Car_Rental_System() {
        this.customerName = "Unknown";
        this.carModel = "Standard";
        this.rentalDays = 1;
        calculateTotal();
    }
    Car_Rental_System(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        calculateTotal();
    }
    void calculateTotal() {
        totalCost = rentalDays * costPerDay;
    }
    void display() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel + ", Days: " + rentalDays + ", Total Cost: " + totalCost);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customer name : ");
        String name = sc.nextLine();
        System.out.print("Enter car model : ");
        String car = sc.nextLine();
        System.out.print("Enter rental days : ");
        int days = sc.nextInt(); 
        Car_Rental_System rental = new Car_Rental_System(name, car, days);
        rental.display();
        sc.close();
    }
}
