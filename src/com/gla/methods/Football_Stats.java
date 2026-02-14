public class Football_Stats {
    private static final int TEAM_SIZE = 11;
    private static final int MIN_HEIGHT = 150;
    private static final int MAX_HEIGHT = 250;
    public static void main(String[] args) {
        int[] heights = generateHeights();
        displayArray(heights);
        double mean = calcMean(heights);
        int shortest = findMin(heights);
        int tallest = findMax(heights);
        System.out.println("\nStatistics:");
        System.out.println("Shortest Height : " + shortest);
        System.out.println("Tallest Height  : " + tallest);
        System.out.println("Mean Height     : " + mean);
    }
    public static int[] generateHeights() {
        int[] arr = new int[TEAM_SIZE];
        for(int i = 0; i < TEAM_SIZE; i++) {
            arr[i] = (int)(Math.random() * (MAX_HEIGHT - MIN_HEIGHT + 1)) + MIN_HEIGHT;
        }
        return arr;
    }
    public static int calcSum(int[] arr) {
        int tot = 0;
        for(int value : arr) tot += value;
        return tot;
    }
    public static double calcMean(int[] arr) {
        return (double) calcSum(arr) / arr.length;
    }
    public static int findMin(int[] arr) {
        int min = arr[0];
        for(int value : arr) if(value < min) min = value;
        return min;
    }
    public static int findMax(int[] arr) {
        int max = arr[0];
        for(int value : arr) if(value > max) max = value;
        return max;
    }
    public static void displayArray(int[] arr) {
        System.out.println("Player Heights:");
        for(int value : arr) {
            System.out.print(value + " ");
        }
    }
}
