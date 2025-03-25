import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn  = new Scanner(System.in);
        int counter = 1;
        double totalSum = 0;
        do {
            System.out.println("Please enter #" + counter + ": ");
            String nextNumber = sn.nextLine();
            try {
                double number = Double.parseDouble(nextNumber);
                counter++;
                totalSum += number;

            } catch (NumberFormatException e) {
                System.out.println("Incorect character. Try again.");
            }
        } while (counter <= 5);
        System.out.println("The total sum is " + totalSum);
    }
}