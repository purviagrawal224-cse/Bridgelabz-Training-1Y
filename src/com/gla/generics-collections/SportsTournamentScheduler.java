import java.util.*;
class Team implements Comparable<Team> {
    String name;
    int pts;
    Team(String name) {
        this.name = name;
        this.pts = 0;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Team)) return false;
        Team t = (Team) o;
        return name.equals(t.name);
    }
    public int hashCode() {
        return Objects.hash(name);
    }
    public int compareTo(Team o) {
        if (o.pts != this.pts) return o.pts - this.pts;
        return this.name.compareTo(o.name);
    }
    public String toString() {
        return name + " " + pts;
    }
}
class Match {
    Team t1, t2;
    Match(Team t1, Team t2) {
        this.t1 = t1;
        this.t2 = t2;
    }
}
class Result {
    String win;
    Result(String win) {
        this.win = win;
    }
    public String toString() {
        return "Winner: " + win;
    }
}
public class SportsTournamentScheduler {
    public static void main(String[] args) {
        Set<Team> teams = new HashSet<>();
        Team a = new Team("A");
        Team b = new Team("B");
        Team c = new Team("C");
        teams.add(a);
        teams.add(b);
        teams.add(c);
        Queue<Match> q = new LinkedList<>();
        q.add(new Match(a, b));
        q.add(new Match(b, c));
        List<Result> results = new ArrayList<>();
        while (!q.isEmpty()) {
            Match m = q.remove();
            Team winner = m.t1;
            winner.pts += 10;
            System.out.println("Match: " + m.t1.name + " vs " + m.t2.name + " -> " + winner.name);
            results.add(new Result(winner.name));
        }
        TreeSet<Team> leaderboard = new TreeSet<>(teams);
        System.out.println("Results:");
        for (Result r : results) System.out.println(r);
        System.out.println("Leaderboard:");
        for (Team t : leaderboard) System.out.println(t);
    }
}