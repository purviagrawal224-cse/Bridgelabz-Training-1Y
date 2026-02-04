import java.util.Scanner;

public class Applicable_For_Vote {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.print("Enter the age of students");
        for (int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++){
            if(arr[i]>=18) System.out.println("The student with the age "+arr[i]+" can vote.");
            else System.out.println("The student with the age "+arr[i]+" cannot vote.");
        }
        sc.close();
    }
}
