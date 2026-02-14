public class Spring_Season {
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        boolean res = check(month, day);
        if(res) System.out.println("Its a Spring Season");
        else System.out.println("Not a Spring Season");
    }
    public static boolean check(int month, int day) {
        if(month == 3 && day >= 20) return true;
        else if(month > 3 && month < 6) return true;
        else if(month == 6 && day <= 20) return true;
        else return false;
    }
}