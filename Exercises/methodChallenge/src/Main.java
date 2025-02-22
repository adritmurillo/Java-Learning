public class Main {
    public static void main(String[] args) {
        displayPlayerRank("Joaquin", 1500);
        displayPlayerRank("Roy", 1000);
        displayPlayerRank("Leonardo", 500);
        displayPlayerRank("Juan Diego" , 100);
        displayPlayerRank("Milagros", 50);
    }


    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName + " managed to get into position " + playerPosition +
                " on the high score table");
    }

    public static void displayPlayerRank(String playerName, int playerScore){
        int playerPosition = calculateHighScorePosition(playerScore);
        displayHighScorePosition(playerName, playerPosition);
    }

    public static int calculateHighScorePosition(int playerScore){
        int position = 4;
        if (playerScore >= 1000){
            position = 1;
        }
        else if (playerScore >= 500){
            position = 2;
        }
        else if (playerScore >= 100){
            position = 3;
        }


        return position;



    }



}
