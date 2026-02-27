import java.util.Random;
import java.util.Scanner;
public class Rock_Paper_Scissors {
    public static String getChoice(int n) {
        if (n == 0) return "Rock";
        if (n == 1) return "Paper";
        return "Scissors";
    }
    public static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if (user.equals("Rock") && comp.equals("Scissors")) return "User Wins";
        if (user.equals("Paper") && comp.equals("Rock")) return "User Wins";
        if (user.equals("Scissors") && comp.equals("Paper")) return "User Wins";
        return "Computer Wins";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Choose:");
        System.out.println("0 - Rock");
        System.out.println("1 - Paper");
        System.out.println("2 - Scissors");
        int user_Input = sc.nextInt();
        if(user_Input < 0 || user_Input > 2) {
            System.out.println("Invalid choice");
            return;
        }
        String userChoice = getChoice(user_Input);
        int comp_Input = rd.nextInt(3);
        String compChoice = getChoice(comp_Input);
        String result = findWinner(userChoice, compChoice);
        System.out.println("User Choice: " + userChoice);
        System.out.println("Computer Choice: " + compChoice);
        System.out.println("Result: " + result);
    }
}
