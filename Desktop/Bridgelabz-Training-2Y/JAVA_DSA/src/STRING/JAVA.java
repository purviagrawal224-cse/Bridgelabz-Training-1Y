package STRING;

import java.util.Arrays;
public class JAVA{
    public static void main(String[] args){
        int n = 1213243547;
        int[] freq = new int[10];
        while (n > 0) {
            int d = n % 10;
            freq[d] = freq[d] + 1;
            n /= 10;
        }
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0)
                System.out.println(i + " : " + freq[i]);
        }
    }

}
