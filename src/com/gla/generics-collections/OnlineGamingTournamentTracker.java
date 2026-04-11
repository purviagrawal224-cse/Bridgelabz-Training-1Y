import java.util.*;
class Player {
    String name;
    int score;
    Player(String name) {
        this.name = name;
        this.score = 0;
    }
    public String toString() {
        return name + " " + score;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        Player p = (Player) o;
        return name.equals(p.name);
    }
    public int hashCode() {
        return Objects.hash(name);
    }
}
class Match {
    Player p1, p2;
    Match(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
}
class Score implements Comparable<Score> {
    String name;
    int score;
    Score(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public int compareTo(Score o) {
        if (o.score != this.score) return o.score - this.score;
        return this.name.compareTo(o.name);
    }
    public String toString() {
        return name + " " + score;
    }
}
public class OnlineGamingTournamentTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Player> players = new HashSet<>();
        Map<String, Player> map = new HashMap<>();
        Queue<Match> q = new LinkedList<>();
        List<String> results = new ArrayList<>();
        System.out.print("Enter number of players: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            Player p = new Player(name);
            if (players.add(p)) map.put(name, p);
            else System.out.println("Duplicate player ignored: " + name);
        }
        System.out.print("Enter number of matches: ");
        int m = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < m; i++) {
            String p1 = sc.nextLine();
            String p2 = sc.nextLine();
            q.add(new Match(map.get(p1), map.get(p2)));
        }
        System.out.println("Processing Matches:");
        while (!q.isEmpty()) {
            Match match = q.remove();
            System.out.println("Enter winner for: " + match.p1.name + " vs " + match.p2.name);
            String w = sc.nextLine();
            Player win = map.get(w);
            win.score += 10;
            results.add("Winner: " + w);
        }
        TreeSet<Score> leaderboard = new TreeSet<>();
        for (Player p : players) leaderboard.add(new Score(p.name, p.score));
        System.out.println("Results:");
        for (String r : results) System.out.println(r);
        System.out.println("Leaderboard:");
        for (Score s : leaderboard) System.out.println(s);
    }
}
