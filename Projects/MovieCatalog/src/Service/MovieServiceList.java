package Service;
import Domain.Movie;
import java.util.List;
import java.util.ArrayList;

public class MovieServiceList implements IMovieService {
    private final List<Movie> movieList;

    public MovieServiceList(){
        this.movieList = new ArrayList<>();
    }
    @Override
    public void listMovie() {
        System.out.println("List of movies: ");
        movieList.forEach(System.out::println);
    }

    @Override
    public void addMovie(Movie movie) {
        movieList.add(movie);
        System.out.println(movie.getName() + " has been added");
    }

    @Override
    public void searchMovie(Movie movie) {
        int index = movieList.indexOf(movie);
        if (index == -1){
            System.out.println("Movie "+movie.getName()+" not found");
        } else {
            System.out.println("Movie " + movie.getName() + " found at index: " + index);
        }
    }

    // Lets try our class

    public static void main(String[] args) {
        // First we are creating two objects of Movie class

        Movie firstMovie = new Movie("Spiderman");
        Movie secondMovie = new Movie("Invincible");

        // Now lets create the service (Design pattern service)

        IMovieService movieService = new MovieServiceList();

        // Now we are going to add the movies to the list

        movieService.addMovie(firstMovie);
        movieService.addMovie(secondMovie);

        // List movies

        movieService.listMovie();

        // Now we are going to search for a movie
        // The hashcode and equals method will work for this

        movieService.searchMovie(secondMovie);

    }
}
