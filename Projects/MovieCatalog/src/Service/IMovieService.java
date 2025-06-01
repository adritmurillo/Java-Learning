package Service;
import Domain.Movie;

public interface IMovieService {
    public void listMovie();
    public void addMovie(Movie movie);
    public void searchMovie(Movie movie);

}

