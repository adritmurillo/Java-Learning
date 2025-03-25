import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int currentYear = 2025;

        try{
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e){
            System.out.println(getInputFromScanner(currentYear));
        }

    }

    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine("Hi, whats your name?");
        System.out.println("Hi "+name);

        String dateOfBirth = System.console().readLine("What year were you born?");

        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "You are "+age+" years old";
    }

    public static String getInputFromScanner(int currentYear){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi what is your name??");
        String name = scanner.nextLine();

        System.out.println("Hi "+ name);

        System.out.println("What year were you born?");

        boolean validDOB = false;
        int age = 0;

        do {
            System.out.println("Enter a year of birth >= " +
                    (currentYear - 116) + " and <= " + (currentYear));
            try{
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age < 0 ? false : true;
            } catch (NumberFormatException incorrectUserData){
                System.out.println("You entered an invalid character! Try again.");
            }
        } while (!validDOB);


        return "You are " + age + " years old";
    }

    public static int checkData(int currentYear, String dateOfBirth){
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 116;

        if ((dob < minimumYear) || (dob > currentYear)){
            return -1;
        }

        return (currentYear - dob);
    }
}
