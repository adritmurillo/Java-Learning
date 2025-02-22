public class SecondChallenge {
    public static void main(String[] args) {
        System.out.println(getTime(9000));
    }
    public static String getTime(int seconds){
        if (seconds < 0){
            return "Invalid Value";
        }
        return getTime(seconds / 60, seconds % 60);
    }
    public static String getTime(int minutes, int seconds){
        if(minutes < 0){
            return "Invalid Value";
        }
        if(seconds < 0 || seconds > 59){
            return "Invalid Value";
        }
        int hours = minutes / 60;
        int remainderMinutes = minutes % 60;
        return hours + "h " + remainderMinutes + "m " + seconds + "s";

    }



}
