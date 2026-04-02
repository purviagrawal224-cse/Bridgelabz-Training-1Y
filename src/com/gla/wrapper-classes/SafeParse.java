public class SafeParse {
    public static int safeParseInt(String s) {
        try {
            return Integer.parseInt(s);
        } catch (Exception e) {
            return -1;
        }
    }
    public static void main(String[] args) {
        String[] a = {"123", "abc", "45.6", "0"};
        for(String x : a) System.out.println(safeParseInt(x));
    }
}