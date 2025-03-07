public class Main {
    public static void main(String[] args) {
        DayOfWeek(5);
        printWeekDay(6);
    }

    public static void DayOfWeek(int day){
        switch (day) {
            case 0 -> System.out.println("Day " + day + " is " + "Sunday");
            case 1 -> System.out.println("Day " + day + " is " + "Monday");
            case 2 -> System.out.println("Day " + day + " is " + "Tuesday");
            case 3 -> System.out.println("Day " + day + " is " + "Wednesday");
            case 4 -> System.out.println("Day " + day + " is " + "Thursday");
            case 5 -> System.out.println("Day " + day + " is " + "Friday");
            case 6 -> System.out.println("Day " + day + " is " + "Saturday");
            default -> System.out.println("Day " + day + " was not found in the switch");
        }

    }
    public static void printWeekDay(int day){
        if (day == 0){
            System.out.println("Day " + day + " is " + "Sunday");
        }
        else if (day == 1){
            System.out.println("Day " + day + " is " + "Monday");
        }
        else if (day == 2){
            System.out.println("Day " + day + " is " + "Tuesday");
        }
        else if (day == 3){
            System.out.println("Day " + day + " is " + "Wednesday");
        }
        else if (day == 4){
            System.out.println("Day " + day + " is " + "Thursday");
        }
        else if (day == 5){
            System.out.println("Day " + day + " is " + "Friday");
        }
        else if (day == 6){
            System.out.println("Day " + day + " is " + "Saturday");
        }
        else {
            System.out.println("Day " + day + " was not found in the switch");
        }
    }
}
