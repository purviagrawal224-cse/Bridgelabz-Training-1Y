import java.util.Scanner;
public class String_Length_Without_Length {
    public static int findLength(String str) {
        int count = 0;
        try {
            while(true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        int cus_Len = findLength(str);
        int built_In_Len = str.length();
        System.out.println("Length without length method : " + cus_Len);
        System.out.println("Length using length method : " + built_In_Len);
    }
}