import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter movie type (A, C, S) or Q to quit:");
            String type = scanner.nextLine();
            if("Qq".contains(type)){
                break;
            }
            System.out.println("Enter movie title: ");
            String title = scanner.nextLine();
            Movie theMovie = Movie.getMovie(type, title);
            theMovie.watchMovie();
        }
    }
}
