import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main{
    public static void showMenu(){
        System.out.println("*****WELCOME TO THE PERSON MANAGEMENT SYSTEM*****");
        System.out.println("1. Add a person\n2. View all persons\n3. Exit");
        System.out.print("Please select an option: ");
    }

    public static void main(String[] args) {
        boolean continueLooping = true;
        Scanner scanner = new Scanner(System.in);
        List <Person> personList = new ArrayList<>();

        while(continueLooping){
            showMenu();
            String input = scanner.nextLine();
            try {
                int option = Integer.parseInt(input);
                switch (option) {
                    case 1 -> {
                        System.out.println("Enter the name of the person: ");
                        String name = scanner.nextLine();
                        System.out.println("Enter the phone of the person: ");
                        String phone = scanner.nextLine();
                        System.out.println("Enter the email of the person: ");
                        String email = scanner.nextLine();
                        Person person = new Person(name, phone, email);
                        personList.add(person);
                    }
                    case 2 -> {
                        System.out.println("List of persons: ");
                        personList.forEach(System.out::println);
                    }
                    case 3 -> {
                        System.out.println("Exiting the program...");
                        continueLooping = false;
                    }
                    default -> System.out.println("Invalid option. Please try again.");
                }
            } catch (Exception e){
                System.out.println("You have entered an invalid option. Please try again. You typed: " + input);
            }

        }

    }
}