public class NewMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C","The Hangover");
        Movie comedyMovie = (Movie) comedy;
        comedyMovie.watchMovie();




    }
}
