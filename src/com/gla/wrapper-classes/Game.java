public class Game {
    public static void main(String[] args) {
        Integer[] a = {10, null, 25, 30, null, 15};
        int c = 0;
        int s = 0;
        for(Integer x : a){
            if(x == null) c++;
	    else s += x;
        }
        System.out.println("Players not played = " + c);
        System.out.println("Total score = " + s);
    }
}