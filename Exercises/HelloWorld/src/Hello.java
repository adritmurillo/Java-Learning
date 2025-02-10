public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, world!!");
        String makeOfCar = "Toyota";
        int topScore = 80;
        int secondTopScore = 60;
        int newValue = 50;
        boolean isCar = false;
        boolean isAlien = false;
        boolean isDomestic = makeOfCar == "Toyota" ? false : true;


        if (isAlien == true){
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens!");
        }
        if (topScore >= 100){
            System.out.println("You are the winner!");
        }
        if (topScore > secondTopScore && topScore < 100){
            System.out.println("COMO ESTAS AMIGO");
        }

        if((topScore > 90) || (secondTopScore<=90)){
            System.out.println("Either or both of the conditions are true");
        }

        if (newValue == 50){
            System.out.println("Hello");
        }

        if (!isCar){
            System.out.println("This is not supposed to happen");
        }

        if (isDomestic){
            System.out.println("This car is domestic");
        }

    }
}
