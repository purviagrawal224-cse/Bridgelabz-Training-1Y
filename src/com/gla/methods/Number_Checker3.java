import java.util.Scanner;
public class Number_Checker3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num = Math.abs(num);
        int count = countDigits(num);
        int[] digits = storeDigits(num, count);
        System.out.println("Number : " + num);
        System.out.println("Digit Count : " + count);
        int[] reversed = reverseArray(digits);
        System.out.println("Palindrome Number : " + isPalindrome(digits, reversed));
        System.out.println("Duck Number : " + isDuck(digits));
        sc.close();
    }
    public static int countDigits(int n) {
        if(n == 0) return 1;
        int count = 0;
        while(n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }
    public static int[] storeDigits(int n, int size) {
        int[] arr = new int[size];
        for(int i = size - 1; i >= 0; i--) {
            arr[i] = n % 10;
            n /= 10;
        }
        return arr;
    }
    public static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for(int i = 0; i < arr.length; i++) rev[i] = arr[arr.length - 1 - i];
        return rev;
    }
    public static boolean compareArrays(int[] a, int[] b) {
        if(a.length != b.length) return false;
        for(int i = 0; i < a.length; i++) {
            if(a[i] != b[i]) return false;
        }
        return true;
    }
    public static boolean isPalindrome(int[] original, int[] reversed) {
        return compareArrays(original, reversed);
    }
    public static boolean isDuck(int[] arr) {
        for(int d : arr) {
            if(d == 0) return true;
        }
        return false;
    }
}
