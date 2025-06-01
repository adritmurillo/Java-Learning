package Presentation;
import Service.MovieServiceList;
import Service.*;
import Domain.*;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        boolean continueLoop = false;
        Scanner scanner = new Scanner(System.in);

//        IMovieService movieService = new MovieServiceList();
        IMovieService movieService = new MovieServiceFiles();
        while(!continueLoop){
            try{
                showMenu();
                continueLoop = executeOptions(scanner, movieService);
            }catch(Exception e){
                System.out.println("An error occurred: " + e.getMessage());
            }
            System.out.println("-------------------------------------------------------------");
        }
    }

    private static void showMenu(){
        System.out.println("Welcome to the Movie Service");
        System.out.println("\n1. Add Movie"+
                "\n2. List Movies"+
                "\n3. Search Movie"+
                "\n4. Exit" +
                "\nChoose an option: ");
    }

    private static boolean executeOptions(Scanner scanner, IMovieService movieService){
        var option = Integer.parseInt(scanner.nextLine());
        var exit = false;

        switch (option){
            case 1 -> {
                System.out.println("Type the name of the movie you want to add: ");
                String movieName = scanner.nextLine();
                movieService.addMovie(new Movie(movieName));
            }
            case 2 -> {
                movieService.listMovie();
            }
            case 3 -> {
                System.out.println("Type the name of the you want to search: ");
                String movieName = scanner.nextLine();
                movieService.searchMovie(new Movie(movieName));
            }
            case 4 -> {
                System.out.println("Exiting the program...");
                exit = true;
            }
            default -> {
                System.out.println("Invalid option. Please try again." + option);
            }
        }
        return exit;
    };
}