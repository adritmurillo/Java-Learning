public class Main {

    public static void main(String[] args) {
        double kilometers = (100 * 1.6093455);
        int highScore = 20;
        int health = 100;
        if (highScore > 25) {
            highScore += 100;
        }

        if (health < 25 && highScore > 1000){
            highScore -= 1000;
        }



    }
}
