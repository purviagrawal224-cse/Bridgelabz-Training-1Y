import java.util.*;
class Movie {
    String name;
    String genre;
    Movie(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }
    public String toString() {
        return name + " (" + genre + ")";
    }
}
public class OnlineStreamingWatchHistory {
    public static void main(String[] args) {
        List<Movie> all = new ArrayList<>();
        all.add(new Movie("Movie1", "Action"));
        all.add(new Movie("Movie2", "Comedy"));
        all.add(new Movie("Movie3", "Action"));
        all.add(new Movie("Movie4", "Drama"));
        Queue<Movie> upNext = new LinkedList<>();
        Stack<Movie> history = new Stack<>();
        Set<String> genres = new HashSet<>();
        upNext.add(all.get(0));
        upNext.add(all.get(1));
        upNext.add(all.get(2));
        System.out.println("Watching Movies:");
        while (!upNext.isEmpty()) {
            Movie m = upNext.remove();
            System.out.println("Watched: " + m);
            history.push(m);
            genres.add(m.genre);
        }
        System.out.println("Watch History:");
        for (Movie m : history) System.out.println(m);
        System.out.println("Genres Watched:");
        for (String g : genres) System.out.println(g);
        System.out.println("Recommended Movies:");
        for (Movie m : all) {
            if (genres.contains(m.genre) && !history.contains(m)) System.out.println(m);
        }
    }
}