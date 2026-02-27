import java.util.Scanner;
public class Number_Guessing_Game {
    static int generateGuess(int low, int high) {
        return (low + high) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;
        String feedback;
        while (true) {
            int guess = generateGuess(low, high);
            System.out.println("Computer guesses: " + guess);
            System.out.print("Enter feedback (high/low/correct): ");
            feedback = sc.nextLine();
            if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("Computer guessed correctly!");
                break;
            }
            else if (feedback.equalsIgnoreCase("high")) high = guess - 1;
            else if (feedback.equalsIgnoreCase("low")) low = guess + 1;
        }
        sc.close();
    }
}