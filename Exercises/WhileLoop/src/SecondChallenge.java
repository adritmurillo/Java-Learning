public class SecondChallenge {
    public static void main(String[] args) {
        System.out.println("Result = "+sumDigits(1234));
        System.out.println("Result = "+sumDigits(-125));
        System.out.println("Result = "+sumDigits(4));
        System.out.println("Result = "+sumDigits(32123));

    }
    public static int sumDigits (int number){
        if (number < 0){
            return -1;
        }
        int sum = 0;
        while (number > 9) {
            sum += number % 10;
            number /= 10;
        }
        sum += number;
        return sum;
    }
}
