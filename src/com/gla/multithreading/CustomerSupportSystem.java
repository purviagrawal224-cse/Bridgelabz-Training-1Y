import java.util.*;
class CustomerSupportSystem extends Thread {
    int id, p;
    String ty;
    long w;
    static Map<Integer, List<Long>> m = new HashMap<>();
    static long tot = 0;
    CustomerSupportSystem(int id, String ty, int p){
        this.id = id;
        this.ty = ty;
        this.p = p;
        setName("Agent-" + id);
    }
    public void run(){
        try{
            long st = System.currentTimeMillis();
            System.out.println("Start T" + id + " " + ty + " | " + getName() + " | P:" + p);
            int d = new Random().nextInt(5) + 1;
            Thread.sleep(d * 1000);
            long et = System.currentTimeMillis();
            w = (et - st)/1000;
            System.out.println("Done T" + id + " " + ty + " | " + getName() + " | Time:" + w + "s");
            synchronized(CustomerSupportSystem.class){
                tot += w;
                m.putIfAbsent(p, new ArrayList<>());
                m.get(p).add(w);
            }
        }catch(Exception e){}
    }
}
class App {
    public static void main(String[] args) throws Exception {
        List<CustomerSupportSystem> l = new ArrayList<>();
        l.add(new CustomerSupportSystem(1,"Critical",10));
        l.add(new CustomerSupportSystem(2,"Feature",4));
        l.add(new CustomerSupportSystem(3,"Query",2));
        l.add(new CustomerSupportSystem(4,"Feedback",1));
        l.add(new CustomerSupportSystem(5,"Critical",10));
        l.add(new CustomerSupportSystem(6,"Feature",4));
        l.add(new CustomerSupportSystem(7,"Query",2));
        l.add(new CustomerSupportSystem(8,"Feedback",1));
        l.add(new CustomerSupportSystem(9,"Critical",10));
        l.add(new CustomerSupportSystem(10,"Feature",4));
        l.sort((a,b)->b.p-a.p);
        int pos = 1;
        for(CustomerSupportSystem t : l){
            System.out.println("Queue Pos " + pos++ + " -> T" + t.id + " P:" + t.p);
        }
        for(CustomerSupportSystem t : l) t.start();
        for(CustomerSupportSystem t : l) t.join();
        System.out.println("Total Time: " + CustomerSupportSystem.tot + "s")
        for(int k : CustomerSupportSystem.m.keySet()){
            List<Long> v = CustomerSupportSystem.m.get(k);
            long s = 0;
            for(long x : v) s += x;
            System.out.println("Avg for P" + k + ": " + (s / v.size()) + "s");
        }
    }
}