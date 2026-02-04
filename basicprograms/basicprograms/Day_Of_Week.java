public class Day_Of_Week {
    public static void main(String[] args){
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
        int yO = y-(14-m)/12;
        int x = yO+yO/4-yO/100+yO/400;
        int mO = m+12*((14-m)/12)-2;
        int dO = (d+x+(31*mO)/12)%7;
        System.out.println(dO);
    }
}
