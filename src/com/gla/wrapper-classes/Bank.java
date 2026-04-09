public class Bank {
    public static double rem(Double x) {
        if(x == null) return 0.0;
        return x;
    }
    public static void main(String[] args) {
        Double a = 5000.0;
        Double b = null;
        System.out.println(rem(a));
        System.out.println(rem(b));
    }
}