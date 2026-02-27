import java.util.Scanner;

public class Arrays_Out_Of_Bound_Exp {
    static void generate_Exp(String[] arr) {
        System.out.println(arr[arr.length]);
    }
    static void handle_Exp(String[] arr) {
        try {
            System.out.println(arr[arr.length]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught");
            System.out.println(e);
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException caught");
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }
        try {
            generate_Exp(names);
        }
        catch (Exception e) {
            System.out.println("Exception generated");
        }
        handle_Exp(names);
    }
}
