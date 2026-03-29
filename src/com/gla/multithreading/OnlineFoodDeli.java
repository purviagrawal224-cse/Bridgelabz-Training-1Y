import java.util.*;
class OnlineFoodDeli implements Runnable {
    int id, t;
    String r, ty;
    OnlineFoodDeli(int id, String r, int t, String ty){
        this.id = id;
        this.r = r;
        this.t = t;
        this.ty = ty;
    }
    public void run(){
        long st = System.currentTimeMillis();
        System.out.println("Order " + id + " from " + r + " Picked up by " + Thread.currentThread().getName());
        try{ Thread.sleep(1000); }catch(Exception e){}
        System.out.println("Order " + id + " In Transit by " + Thread.currentThread().getName());
        try{ Thread.sleep(t * 1000); }catch(Exception e){}
        System.out.println("Order " + id + " Delivered by " + Thread.currentThread().getName());
        long et = System.currentTimeMillis();
        System.out.println("Order " + id + " Total Time: " + (et - st)/1000 + " sec");
    }
}
class App {
    public static void main(String[] args){
        OnlineFoodDeli o1 = new OnlineFoodDeli(1, "Dominos", 3, "Express");
        OnlineFoodDeli o2 = new OnlineFoodDeli(2, "KFC", 5, "Standard");
        OnlineFoodDeli o3 = new OnlineFoodDeli(3, "BurgerKing", 4, "Economy");
        OnlineFoodDeli o4 = new OnlineFoodDeli(4, "PizzaHut", 2, "Express");
        OnlineFoodDeli o5 = new OnlineFoodDeli(5, "Subway", 6, "Standard");
        Thread t1 = new Thread(o1, "Agent-1");
        Thread t2 = new Thread(o2, "Agent-2");
        Thread t3 = new Thread(o3, "Agent-3");
        Thread t4 = new Thread(o4, "Agent-4");
        Thread t5 = new Thread(o5, "Agent-5");
        if(o1.ty.equalsIgnoreCase("Express")) t1.setPriority(10);
        else if(o1.ty.equalsIgnoreCase("Standard")) t1.setPriority(5);
        else t1.setPriority(3);
        if(o2.ty.equalsIgnoreCase("Express")) t2.setPriority(10);
        else if(o2.ty.equalsIgnoreCase("Standard")) t2.setPriority(5);
        else t2.setPriority(3);
        if(o3.ty.equalsIgnoreCase("Express")) t3.setPriority(10);
        else if(o3.ty.equalsIgnoreCase("Standard")) t3.setPriority(5);
        else t3.setPriority(3);
        if(o4.ty.equalsIgnoreCase("Express")) t4.setPriority(10);
        else if(o4.ty.equalsIgnoreCase("Standard")) t4.setPriority(5);
        else t4.setPriority(3);
        if(o5.ty.equalsIgnoreCase("Express")) t5.setPriority(10);
        else if(o5.ty.equalsIgnoreCase("Standard")) t5.setPriority(5);
        else t5.setPriority(3);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}