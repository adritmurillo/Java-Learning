public class FirstChallenge {
    public static void main(String[] args) {
        int start = 4;
        int end = 20;
        int evenCounter = 0;
        while (start <= end){
            if (isEvenNumber(start)) {
                System.out.println("Even number: "+start);
                evenCounter++;
                if (evenCounter == 5) {
                    break;
                }
            }
            start++;
        }
        System.out.println("We have "+evenCounter+" even numbers");

    }
    public static boolean isEvenNumber (int number){
        return number % 2 == 0;
    }
}