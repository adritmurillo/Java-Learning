import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        performOperations();
    }

    public static void showMenu(){
        System.out.println("Please select what operation you would like to perform: \n1. Add\n2. Subtract\n3. Multiply\n4. Divide" +
                "\n5. Exit");
    }
    public static void performOperations(){
        boolean continueOperating = true;
        Scanner scanner = new Scanner(System.in);
        while (continueOperating) {
            showMenu();
            String input = scanner.next();
            try {
                int operation = Integer.parseInt(input);
                switch (operation) {
                    case 1 -> {
                        System.out.println("Enter the first number: ");
                        double num1 = scanner.nextDouble();
                        System.out.println("Enter the second number: ");
                        double num2 = scanner.nextDouble();
                        double result = num1 + num2;
                        System.out.println("Result: " + result);
                    }
                    case 2 -> {
                        System.out.println("Enter the first number: ");
                        double num1 = scanner.nextDouble();
                        System.out.println("Enter the second number: ");
                        double num2 = scanner.nextDouble();
                        double result = num1 - num2;
                        System.out.println("Result: " + result);
                    }
                    case 3 -> {
                        System.out.println("Enter the first number: ");
                        double num1 = scanner.nextDouble();
                        System.out.println("Enter the second number: ");
                        double num2 = scanner.nextDouble();
                        double result = num1 * num2;
                        System.out.println("Result: " + result);
                    }
                    case 4 -> {
                        System.out.println("Enter the first number: ");
                        double num1 = scanner.nextDouble();
                        System.out.println("Enter the second number: ");
                        double num2 = scanner.nextDouble();
                        double result = num1 / num2;
                        System.out.println("Result: " + result);
                    }
                    case 5 -> {
                        System.out.println("Exiting the program.");
                        scanner.close();
                        continueOperating = false;
                    }
                    default -> System.out.println("Invalid input");
                }
            } catch (Exception e) {
                System.out.println("Please enter a valid number. You typed: " + e.getMessage());
            }
        }
    }


}