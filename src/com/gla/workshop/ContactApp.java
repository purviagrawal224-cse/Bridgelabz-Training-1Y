import java.util.Scanner;
class Contact {
    String name;
    String phone;
    Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    void display() {
        System.out.println(String.format("Name: %s, Phone: %s", name, phone));
    }
}
class BusinessContact extends Contact {
    String company;
    BusinessContact(String name, String phone, String company) {
        super(name, phone);
        this.company = company;
    }
    void display() {
        System.out.println(String.format("Name: %s, Phone: %s, Company: %s",
                name.toUpperCase(), phone, company));
    }
}
public class ContactApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter type (1-Personal, 2-Business): ");
        int ch = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter phone number: ");
        String phone = sc.nextLine();
        Contact c = null;
        if (ch == 1) c = new Contact(name, phone);
        else if (ch == 2) {
            System.out.print("Enter company name: ");
            String company = sc.nextLine();
            c = new BusinessContact(name, phone, company);
        } 
        else {
            System.out.println("Invalid choice");
            return;
        }
        c.display();
        sc.close();
    }
}