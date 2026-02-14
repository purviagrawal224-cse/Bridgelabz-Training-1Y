import java.util.Scanner;
public class Natural_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }
        int recSum = findSumRecursive(n);
        int formulaSum = findSumFormula(n);
        System.out.println("Sum using recursion : " + recSum);
        System.out.println("Sum using formula : " + formulaSum);
        if (recSum == formulaSum) System.out.println("Both methods give the same result.");
        else System.out.println("Results are different.");
        sc.close();
    }
    public static int findSumRecursive(int n) {
        if (n == 1) return 1;
        return n + findSumRecursive(n - 1);
    }
    public static int findSumFormula(int n) {
        return n * (n + 1) / 2;
    }
}
