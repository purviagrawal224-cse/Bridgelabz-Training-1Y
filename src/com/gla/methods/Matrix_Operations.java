import java.util.Scanner;
public class Matrix_Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns for matrices: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] A = generateMatrix(rows, cols);
        int[][] B = generateMatrix(rows, cols);
        System.out.println("Matrix A:");
        displayMatrix(A);
        System.out.println("Matrix B:");
        displayMatrix(B);
        System.out.println("A + B:");
        displayMatrix(addMatrices(A, B));
        System.out.println("A - B:");
        displayMatrix(subtractMatrices(A, B));
        if (cols == A[0].length && rows == B.length) {
            System.out.println("A x B:");
            displayMatrix(multiplyMatrices(A, B));
        }
        else System.out.println("Multiplication not possible with given dimensions.");
        sc.close();
    }
    public static int[][] generateMatrix(int rows, int cols) {
        int[][] mat = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) mat[i][j] = (int) (Math.random() * 10);
        return mat;
    }
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] res = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) res[i][j] = A[i][j] + B[i][j];
        return res;
    }
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] res = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) res[i][j] = A[i][j] - B[i][j];
        return res;
    }
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = B[0].length, common = A[0].length;
        int[][] res = new int[rows][cols];
        for (int i = 0; i < rows; i++) 
            for (int j = 0; j < cols; j++)
                for (int k = 0; k < common; k++) res[i][j] += A[i][k] * B[k][j];
        return res;
    }
    public static void displayMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) System.out.print(val + "\t");
            System.out.println();
        }
    }
}
