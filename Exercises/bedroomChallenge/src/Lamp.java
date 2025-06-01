public class Lamp {
    private String style;
    private boolean battery;
    private int globRating;

    public Lamp(String style, boolean battery, int globRating){
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public String getStyle() {
        return style;
    }
    public boolean isBattery() {
        return battery;
    }
    public int getGlobRating() {
        return globRating;
    }

    public void setStyle(String style) {
        this.style = style;
    }
    public void setBattery(boolean battery) {
        this.battery = battery;
    }
    public void setGlobRating(int globRating) {
        this.globRating = globRating;
    }

    public void turnOn(){
        System.out.println("Lamp -> Turning on");
    }
}
