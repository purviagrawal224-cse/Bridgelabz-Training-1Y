public class Random_Numbers {
    public static int[] generate_4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) arr[i] = 1000 + (int)(Math.random() * 9000);
        return arr;
    }
    public static double[] findAvgMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        double sum = 0;
        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
        }
        double avg = sum / numbers.length;
        return new double[]{avg, min, max};
    }
    public static void main(String[] args) {
        int[] arr = generate_4DigitRandomArray(5);
        for(int i = 0; i < arr.length; i++) System.out.println(arr[i]);
        double[] res = findAvgMinMax(arr);
        System.out.println("Average : " + res[0]);
        System.out.println("Min : " + (int) res[1]);
        System.out.println("Max : " + (int) res[2]);
    }
}
