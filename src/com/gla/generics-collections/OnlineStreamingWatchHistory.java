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
        Scanner sc = new Scanner(System.in);
        List<Movie> all = new ArrayList<>();
        System.out.print("Enter number of movies: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String genre = sc.nextLine();
            all.add(new Movie(name, genre));
        }
        Queue<Movie> upNext = new LinkedList<>();
        System.out.print("Enter number of movies to add in Up Next: ");
        int m = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < m; i++) {
            String name = sc.nextLine();
            for (Movie mv : all) {
                if (mv.name.equals(name)) upNext.add(mv);
            }
        }
        Stack<Movie> history = new Stack<>();
        Set<String> genres = new HashSet<>();
        System.out.println("Watching Movies:");
        while (!upNext.isEmpty()) {
            Movie mv = upNext.remove();
            System.out.println("Watched: " + mv);
            history.push(mv);
            genres.add(mv.genre);
        }
        System.out.println("Recommended Movies:");
        for (Movie mv : all) {
            if (genres.contains(mv.genre) && !history.contains(mv)) System.out.println(mv);
        }
    }
}
