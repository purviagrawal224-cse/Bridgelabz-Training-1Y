import java.util.Scanner;

public class Largest_First_Second_Digit_Dynamic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        n = Math.abs(n);
        if(n==0){
            System.out.println("Largest digit is "+n);
            System.out.println("Second largest does not exist");
            sc.close();
            return;
        }
        int maxdigit = 10;
        int[] digits = new int[maxdigit];
        int idx = 0;
        while(n!=0){
            if(idx==maxdigit){
                maxdigit += 10;
                int[] temp = new int[maxdigit];
                for(int i=0; i<digits.length; i++) temp[i] = digits[i];
                digits = temp;
            }
            digits[idx] = n%10;
            n /= 10;
            idx++;
        }
        int largest = -1;
        int secLargest = -1;
        for(int i=0; i<idx; i++){
            if(digits[i]>largest){
                secLargest = largest;
                largest = digits[i];
            }
            else if(digits[i]>secLargest && digits[i] != largest) secLargest = digits[i];
        }
        System.out.println("Largest digit is "+largest);
        if(secLargest!=-1) System.out.println("Second largest digit is "+secLargest);
        else System.out.println("Second largest digit does not exist");
        sc.close();
    }
}
