public class SecondChallenge {
    public static void main(String[] args) {
        int divisibleNumber = 0;
        int totalSum = 0;
        for (int i = 1; i <= 1000; i++){
            if (i % 3 == 0 && i % 5 == 0){
                divisibleNumber++;
                totalSum += i;
                System.out.println(i + " is a divisible number by both 3 and 5");
                if (divisibleNumber == 5){
                    System.out.println("Found 5 - Exiting loop");
                    break;
                }
            }
        }
        System.out.println("There are " +divisibleNumber+ " divisible numbers");
        System.out.println("The total sum is " + totalSum);
    }
}
