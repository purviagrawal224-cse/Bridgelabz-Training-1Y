import java.util.Scanner;
public class HotelBooking {
    String guestName;
    String roomType;
    int nights;
    HotelBooking() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    HotelBooking(HotelBooking hb) {
        this.guestName = hb.guestName;
        this.roomType = hb.roomType;
        this.nights = hb.nights;
    }
    void display() {
        System.out.println("Guest: " + guestName + ", Room: " + roomType + ", Nights: " + nights);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter guest name: ");
        String name = sc.nextLine();
        System.out.print("Enter room type: ");
        String room = sc.nextLine();
        System.out.print("Enter number of nights: ");
        int nights = sc.nextInt();
        HotelBooking defaultBooking = new HotelBooking();
        HotelBooking userBooking = new HotelBooking(name, room, nights);
        HotelBooking copyBooking = new HotelBooking(userBooking);
        defaultBooking.display();
        userBooking.display();
        copyBooking.display();
        sc.close();
    }
}
