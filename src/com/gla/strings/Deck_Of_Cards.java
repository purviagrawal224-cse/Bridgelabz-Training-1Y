import java.util.Scanner;
public class Deck_Of_Cards {
    public static String[] initialize_Deck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int num_Of_Cards = suits.length * ranks.length;
        String[] deck = new String[num_Of_Cards];
        int index = 0;
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) deck[index++] = ranks[j] + " of " + suits[i];
        }
        return deck;
    }
    public static String[] shuffle_Deck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }
    public static String[][] distribute_Cards(String[] deck, int players, int cards) {
        if (players * cards > deck.length) return null;
        String[][] res = new String[players][cards];
        int index = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cards; j++) res[i][j] = deck[index++];
        }
        return res;
    }
    public static void print_Players(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (int j = 0; j < players[i].length; j++) System.out.println("  " + players[i][j]);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of players: ");
        int players = sc.nextInt();
        System.out.print("Enter number of cards per player: ");
        int cards = sc.nextInt();
        String[] deck = initialize_Deck();
        deck = shuffle_Deck(deck);
        String[][] result = distribute_Cards(deck, players, cards);
        if (result == null) System.out.println("Cards cannot be distributed.");
        else print_Players(result);
        sc.close();
    }
}
