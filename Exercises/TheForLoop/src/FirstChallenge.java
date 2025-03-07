public class FirstChallenge {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 10 ; i <= 50; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime number");
                counter++;
                if (counter == 3){
                    System.out.println("We just found " + counter+ " prime numbers. Exiting the loop");
                    break;
                }
            }
        }

    }

    public static boolean isPrime(int number){
        if (number <= 2){
            return (number == 2) ? true : false;
        }

        for (int i = 2 ; i < number; i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
