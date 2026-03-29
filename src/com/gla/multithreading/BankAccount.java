import java.util.*;
class BankAccount implements Runnable {
    String n, t;
    BankAccount(String n, String t){
        this.n = n;
        this.t = t;
    }
    public void run(){
        for(int i=1; i<=3; i++){
            System.out.println(n + " (" + t + ") checking balance | Priority: " + Thread.currentThread().getPriority());
            try{
                Thread.sleep(2000);
            }catch(Exception e){}
        }
    }
}
class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n1 = sc.nextLine();
        String t1 = sc.nextLine();
        String n2 = sc.nextLine();
        String t2 = sc.nextLine();
        String n3 = sc.nextLine();
        String t3 = sc.nextLine();
        BankAccount b1 = new BankAccount(n1, t1);
        BankAccount b2 = new BankAccount(n2, t2);
        BankAccount b3 = new BankAccount(n3, t3);
        Thread th1 = new Thread(b1);
        Thread th2 = new Thread(b2);
        Thread th3 = new Thread(b3);
        if(t1.equalsIgnoreCase("Premium")) th1.setPriority(10);
        else if(t1.equalsIgnoreCase("Regular")) th1.setPriority(5);
        else th1.setPriority(1);
        if(t2.equalsIgnoreCase("Premium")) th2.setPriority(10);
        else if(t2.equalsIgnoreCase("Regular")) th2.setPriority(5);
        else th2.setPriority(1);
        if(t3.equalsIgnoreCase("Premium")) th3.setPriority(10);
        else if(t3.equalsIgnoreCase("Regular")) th3.setPriority(5);
        else th3.setPriority(1);
        th1.start();
        th2.start();
        th3.start();
    }
}