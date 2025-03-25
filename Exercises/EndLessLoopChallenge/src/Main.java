import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double max = 0;
        double min = 0;
        int loopCount = 0;

        while (true){
            System.out.println("Enter any number.");
            String input = scanner.nextLine();
            try{
                double validNum = Double.parseDouble(input);
                if (loopCount == 0 || validNum < min){
                    min = validNum;
                }
                if (loopCount == 0 || validNum > max){
                    max = validNum;
                }
                loopCount++;
            } catch (NumberFormatException e){
                break;
            }
        }
        if (loopCount > 0){
            System.out.println("The maximum number is " + max);
            System.out.println("The minimum number is " + min);
        } else {
            System.out.println("No valid data");
        }
    }
}
