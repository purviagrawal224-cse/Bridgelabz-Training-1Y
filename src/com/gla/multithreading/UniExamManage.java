import java.util.*;
class UniExamManage implements Runnable {
    String n;
    int d;
    UniExamManage(String n, int d){
        this.n = n;
        this.d = d;
    }
    public void run(){
        try{
            if(n.equals("Entry")){
                for(int i=1; i<=5; i++){
                    System.out.println(n + " running | " + Thread.currentThread().getState());
                    Thread.sleep(2000);
                }
            }
            else if(n.equals("Question")){
                Thread.sleep(5000);
                System.out.println(n + " started | " + Thread.currentThread().getState());
            }
            else if(n.equals("Attendance")){
                Thread.sleep(10000);
                System.out.println(n + " started | " + Thread.currentThread().getState());
            }
            else{
                Thread.sleep(d);
                System.out.println(n + " started | " + Thread.currentThread().getState());
            }
        }catch(Exception e){}
    }
}
class App {
    public static void main(String[] args) throws Exception {
        UniExamManage e = new UniExamManage("Entry", 0);
        UniExamManage q = new UniExamManage("Question", 0);
        UniExamManage a = new UniExamManage("Attendance", 0);
        UniExamManage c = new UniExamManage("Collection", 15000);
        Thread t1 = new Thread(e);
        Thread t2 = new Thread(q);
        Thread t3 = new Thread(a);
        Thread t4 = new Thread(c);
        t1.setPriority(5);
        t2.setPriority(10);
        t3.setPriority(8);
        t4.setPriority(7);
        System.out.println("Before start:");
        System.out.println(t1.getState());
        System.out.println(t2.getState());
        System.out.println(t3.getState());
        System.out.println(t4.getState());
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        Thread.sleep(1000);
        System.out.println("After start:");
        System.out.println(t1.getState());
        System.out.println(t2.getState());
        System.out.println(t3.getState());
        System.out.println(t4.getState());
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        System.out.println("All tasks completed");
    }
}