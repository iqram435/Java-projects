public class MovieTest {
    public static void main(String[] args) {

        Movie[] movies = new Movie[3];

        movies[0] = new Movie("Inception", 2010, "Sci-Fi");
        movies[1] = new Movie("The Godfather", 1972, "Crime");
        movies[2] = new Movie("Titanic", 1997, "Romance");

        System.out.println("--- Movie Details (Array Version) ---");
        for (Movie m : movies) {
            m.display();
            System.out.println();
        }
    }
}
