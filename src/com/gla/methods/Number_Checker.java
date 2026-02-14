import java.util.Scanner;
public class Number_Checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num = Math.abs(num);
        int count = countDigits(num);
        int[] digits = storeDigits(num, count);
        System.out.println("Number : " + num);
        System.out.println("Digit Count : " + count);
        System.out.println("Duck Number : " + isDuck(digits));
        System.out.println("Armstrong Number : " + isArmstrong(num, digits));
        int[] largest = largestTwo(digits);
        System.out.println("Largest : " + largest[0]);
        System.out.println("Second Largest : " + largest[1]);
        int[] smallest = smallestTwo(digits);
        System.out.println("Smallest : " + smallest[0]);
        System.out.println("Second Smallest : " + smallest[1]);
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
    public static boolean isDuck(int[] arr) {
        for(int d : arr) if(d == 0) return true;
        return false;
    }
    public static boolean isArmstrong(int num, int[] arr) {
        int sum = 0;
        int power = arr.length;
        for(int d : arr) sum += (int)Math.pow(d, power);
        return sum == num;
    }
    public static int[] largestTwo(int[] arr) {
        int first = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        for(int d : arr) {
            if(d > first) {
                sec = first;
                first = d;
            }
            else if(d > sec) sec = d;
        }
        return new int[]{first, sec};
    }
    public static int[] smallestTwo(int[] arr) {
        int first = Integer.MAX_VALUE;
        int sec = Integer.MAX_VALUE;
        for(int d : arr) {
            if(d < first) {
                sec = first;
                first = d;
            }
            else if(d < sec) sec = d;
        }
        return new int[]{first, sec};
    }
}
