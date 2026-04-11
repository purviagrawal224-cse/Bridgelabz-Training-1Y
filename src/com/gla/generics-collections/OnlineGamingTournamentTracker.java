import java.util.*;

class Player {
    String name;
    Player(String name) {
        this.name = name;
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
    public String toString() {
        return name;
    }
}
class Match {
    Player p1, p2;
    Match(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
}
class Result {
    String winner;
    Result(String winner) {
        this.winner = winner;
    }
    public String toString() {
        return "Winner: " + winner;
    }
}
class Score implements Comparable<Score> {
    String name;
    int pts;
    Score(String name, int pts) {
        this.name = name;
        this.pts = pts;
    }
    public int compareTo(Score o) {
        if (o.pts != this.pts) return o.pts - this.pts;
        return this.name.compareTo(o.name);
    }
    public String toString() {
        return name + " " + pts;
    }
}
public class OnlineGamingTournamentTracker {
    public static void main(String[] args) {
        Set<Player> players = new HashSet<>();
        players.add(new Player("A"));
        players.add(new Player("B"));
        players.add(new Player("C"));
        players.add(new Player("A"));
        Queue<Match> q = new LinkedList<>();
        List<Player> list = new ArrayList<>(players);
        q.add(new Match(list.get(0), list.get(1)));
        q.add(new Match(list.get(1), list.get(2)));
        List<Result> results = new ArrayList<>();
        TreeSet<Score> leaderboard = new TreeSet<>();
        Map<String, Integer> map = new HashMap<>();
        while (!q.isEmpty()) {
            Match m = q.remove();
            String win = m.p1.name;
            System.out.println("Match: " + m.p1 + " vs " + m.p2 + " -> " + win);
            results.add(new Result(win));
            map.put(win, map.getOrDefault(win, 0) + 10);
        }
        for (Map.Entry<String, Integer> e : map.entrySet()) leaderboard.add(new Score(e.getKey(), e.getValue()));
        System.out.println("Results:");
        for (Result r : results) System.out.println(r);
        System.out.println("Leaderboard:");
        for (Score s : leaderboard) System.out.println(s);
    }
}