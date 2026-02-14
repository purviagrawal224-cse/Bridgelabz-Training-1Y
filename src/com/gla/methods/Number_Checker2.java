import java.util.Scanner;
public class Number_Checker2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num = Math.abs(num);
        int count = countDigits(num);
        int[] digits = storeDigits(num, count);
        System.out.println("Number : " + num);
        System.out.println("Digit Count : " + count);
        int sum = sumOfDigits(digits);
        System.out.println("Sum of Digits : " + sum);
        int squareSum = sumOfSquares(digits);
        System.out.println("Sum of Squares : " + squareSum);
        System.out.println("Harshad Number : " + isHarshad(num, sum));
        int[][] freq = digitFrequency(digits);
        System.out.println("Digit Frequency : ");
        displayFrequency(freq);
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
    public static int sumOfDigits(int[] arr) {
        int sum = 0;
        for(int d : arr) sum += d;
        return sum;
    }
    public static int sumOfSquares(int[] arr) {
        int sum = 0;
        for(int d : arr) sum += (int)Math.pow(d, 2);
        return sum;
    }
    public static boolean isHarshad(int num, int sum) {
        if(sum == 0) return false;
        return num % sum == 0;
    }
    public static int[][] digitFrequency(int[] arr) {
        int[][] freq = new int[10][2];
        for(int i = 0; i < 10; i++) {
            freq[i][0] = i;   // digit
            freq[i][1] = 0;   // frequency
        }
        for(int d : arr) freq[d][1]++;
        return freq;
    }
    public static void displayFrequency(int[][] freq) {
        for(int i = 0; i < 10; i++) {
            if(freq[i][1] > 0) System.out.println(freq[i][0] + " -> " + freq[i][1]);
        }
    }
}
