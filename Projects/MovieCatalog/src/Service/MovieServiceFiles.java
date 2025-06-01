package Service;

import Domain.Movie;

import java.io.*;

public class MovieServiceFiles implements IMovieService{
    private final String FILE_NAME = "movies.txt";
    public MovieServiceFiles(){
        var file = new File(FILE_NAME);
        try{
            // Create the file if it doesn't exist
            if (file.exists()){
                System.out.println("File already exists");
            } else {
                // If the file doesn't exist, create it
                var exit = new PrintWriter(new FileWriter(file));
                exit.close();
                System.out.println("File created successfully");
            }

        } catch(Exception e) {
            System.out.println("Error creating file: " + e.getMessage());
        }
    }


    @Override
    public void listMovie() {
        // We open the file again
        var file = new File(FILE_NAME);
        try{
            System.out.println("List of movies: ");
            // We open the file so we can read it

            var reader = new BufferedReader(new FileReader(file));

            // We read the file line by line

            String line;
            line = reader.readLine();

            // We read all the lines available

            while(line != null){
                var movie = new Movie(line);
                System.out.println(movie);

                // Before finishin the cycle we read the next line

                line = reader.readLine();
            }
            // We close the reader
            reader.close();


        } catch (Exception e){
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    @Override
    public void addMovie(Movie movie) {
        boolean append = false;
        var file = new File(FILE_NAME);
        try{
            // First we check if the file exists already
            append = file.exists();
            var exit = new PrintWriter(new FileWriter(file, append));
            // Add movies with toString
            exit.println(movie);
            exit.close();
            System.out.println(movie.getName() + " has been added");
        } catch(Exception e){
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    @Override
    public void searchMovie(Movie movie) {
        var file = new File(FILE_NAME);
        try{
            // Open the file so we can read it line by line
            var reader = new BufferedReader(new FileReader(file));
            String textLine;
            textLine = reader.readLine();
            var index = 1;
            var founded = false;
            var movieFound = movie.getName();

            while(textLine != null){
                // Search without case sensitivity
                if(movieFound != null && movieFound.equalsIgnoreCase(textLine)){
                    founded = true;
                    break;
                }
                // Read the next line before next iteration
                textLine = reader.readLine();
                index++;
            }
            // Print search results

            if(founded){
                System.out.println("Movie " + textLine + " has been found at index: " + index);
            } else {
                System.out.println("Movie " + movie.getName() + " not found");
            }
            reader.close();

        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
