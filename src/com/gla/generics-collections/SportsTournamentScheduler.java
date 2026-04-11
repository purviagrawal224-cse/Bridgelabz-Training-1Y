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
        if (o.pts != this.pts)
            return o.pts - this.pts;
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
        Scanner sc = new Scanner(System.in);
        Set<Team> teams = new HashSet<>();
        Map<String, Team> map = new HashMap<>();
        System.out.print("Enter number of teams: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            Team t = new Team(name);
            teams.add(t);
            map.put(name, t);
        }
        Queue<Match> q = new LinkedList<>();
        System.out.print("Enter number of matches: ");
        int m = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < m; i++) {
            String t1 = sc.nextLine();
            String t2 = sc.nextLine();
            q.add(new Match(map.get(t1), map.get(t2)));
        }
        List<Result> results = new ArrayList<>();
        while (!q.isEmpty()) {
            Match match = q.remove();
            System.out.println("Enter winner for: " + match.t1.name + " vs " + match.t2.name);
            String w = sc.nextLine();
            Team winner = map.get(w);
            winner.pts += 10;
            results.add(new Result(w));
        }
        TreeSet<Team> leaderboard = new TreeSet<>(teams);
        System.out.println("Results:");
        for (Result r : results)  System.out.println(r);
        System.out.println("Leaderboard:");
        for (Team t : leaderboard) System.out.println(t);
    }
}
