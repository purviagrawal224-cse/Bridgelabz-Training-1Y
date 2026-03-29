import java.util.*;
class SmartHomeAuto implements Runnable {
    String n;
    int d;
    SmartHomeAuto(String n, int d){
        this.n = n;
        this.d = d;
    }
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println(n + " running at " + new Date() + " | Priority: " + Thread.currentThread().getPriority());
            try{
                Thread.sleep(d);
            }catch(Exception e){}
        }
    }
}
class App {
    public static void main(String[] args){
        SmartHomeAuto t = new SmartHomeAuto("Temperature Sensor", 5000);
        SmartHomeAuto s = new SmartHomeAuto("Security Camera", 3000);
        SmartHomeAuto l = new SmartHomeAuto("Light Controller", 4000);
        SmartHomeAuto d = new SmartHomeAuto("Door Lock Monitor", 6000);
        Thread th1 = new Thread(t);
        Thread th2 = new Thread(s);
        Thread th3 = new Thread(l);
        Thread th4 = new Thread(d);
        th1.setPriority(7);
        th2.setPriority(10);
        th3.setPriority(5);
        th4.setPriority(5);
        th1.start();
        th2.start();
        th3.start();
        th4.start();
    }
}