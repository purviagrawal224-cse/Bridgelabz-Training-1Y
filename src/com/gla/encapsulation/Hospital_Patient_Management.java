import java.util.*;
abstract class Patient {
    private int id;
    private String nm;
    private int age;
    private String diag;
    private String hist;
    Patient(int id, String nm, int age) {
        this.id = id;
        this.nm = nm;
        this.age = age;
    }
    public int getId() { return id; }
    public String getNm() { return nm; }
    public int getAge() { return age; }
    public void setDiagnosis(String diag) { this.diag = diag; }
    public void setHistory(String hist) { this.hist = hist; }
    public String getDiagnosis() { return diag; }
    public String getHistory() { return hist; }
    abstract double calculateBill();
    public void getPatientDetails() {
        System.out.println("Id   : " + id);
        System.out.println("Name : " + nm);
        System.out.println("Age  : " + age);
    }
}
interface MedicalRecord {
    void addRecord(String r);
    void viewRecords();
}
class InPatient extends Patient implements MedicalRecord {
    private int days;
    private double rate;
    private ArrayList<String> rec = new ArrayList<>();
    InPatient(int id, String nm, int age, int days, double rate) {
        super(id, nm, age);
        this.days = days;
        this.rate = rate;
    }
    public double calculateBill() {
        return days * rate + 2000;
    }
    public void addRecord(String r) {
        rec.add(r);
    }
    public void viewRecords() {
        for (String s : rec)
            System.out.println(s);
    }
}
class OutPatient extends Patient implements MedicalRecord {
    private double fee;
    private ArrayList<String> rec = new ArrayList<>();
    OutPatient(int id, String nm, int age, double fee) {
        super(id, nm, age);
        this.fee = fee;
    }
    public double calculateBill() {
        return fee + 500;
    }
    public void addRecord(String r) {
        rec.add(r);
    }
    public void viewRecords() {
        for (String s : rec)
            System.out.println(s);
    }
}
public class Hospital_Patient_Management {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Patient> list = new ArrayList<>();
        System.out.print("Enter total patients : ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("\n1.InPatient  2.OutPatient");
            int ch = sc.nextInt();
            sc.nextLine();
            System.out.print("Id : ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name : ");
            String nm = sc.nextLine();
            System.out.print("Age : ");
            int age = sc.nextInt();
            Patient p;
            if(ch == 1) {
                System.out.print("Days : ");
                int d = sc.nextInt();
                System.out.print("Rate per day : ");
                double r = sc.nextDouble();
                p = new InPatient(id, nm, age, d, r);
            }
	    else{
                System.out.print("Consultation fee : ");
                double f = sc.nextDouble();
                p = new OutPatient(id, nm, age, f);
            }
            sc.nextLine();
            p.setDiagnosis("General Checkup");
            p.setHistory("No major history");
            list.add(p);
        }
        System.out.println("\n--- Billing Details ---");
        for (Patient p : list) {
            p.getPatientDetails();
            System.out.println("Bill : " + p.calculateBill());
            if (p instanceof MedicalRecord) {
                MedicalRecord m = (MedicalRecord) p;
                m.addRecord("Visited on 17 Feb");
                m.viewRecords();
            }
            System.out.println("---");
        }
        sc.close();
    }
}
