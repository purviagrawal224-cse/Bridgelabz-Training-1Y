import java.util.Scanner;
public class BackgroundJob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter job name: ");
        String j = sc.nextLine();
        Runnable r = () -> {
            System.out.println("Job " + j + " started");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {}
            System.out.println("Job " + j + " completed");
        };
        Thread t = new Thread(r);
        t.start();
        System.out.println("Main thread continues...");
    }
}