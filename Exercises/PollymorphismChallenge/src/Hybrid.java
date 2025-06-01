public class Hybrid extends Car{
    private double avgKmPerLitre;
    private int cylinders = 6;
    private int batterySize;

    public Hybrid(String description) {
        super(description);
    }

    public Hybrid(String description, double avgKmPerLitre, int cylinders,
                  int batterySize) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println("Hybrid -> switch " + batterySize + " kWh battery on, Ready!");
        System.out.printf("Hybrid -> All %d cylinders are running, Ready!%n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.println("Hybrid -> usage under the average: " + avgKmPerLitre);
    }


}
