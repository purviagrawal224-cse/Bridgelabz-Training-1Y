import java.util.Scanner;
public class Youngest_Friend {
    public static int findYoungest(int[] ages) {
        int minIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minIndex]) minIndex = i;
        }
        return minIndex;
    }
    public static int findTallest(double[] heights) {
        int maxIdx = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxIdx]) maxIdx = i;
        }
        return maxIdx;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] h = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + ": ");
            h[i] = sc.nextDouble();
        }
        int youngestIdx = findYoungest(ages);
        int tallestIdx = findTallest(h);
        System.out.println("Youngest Friend : " + names[youngestIdx]);
        System.out.println("Tallest Friend : " + names[tallestIdx]);
        sc.close();
    }
}
