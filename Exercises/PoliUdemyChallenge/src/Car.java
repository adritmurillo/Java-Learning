public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public String startEngine(){
        return "Engine of type "+ getClass().getSimpleName() + " is starting";
    }

    public String accelerate(){
        return "Car of type "+ getClass().getSimpleName() + " is accelerating";
    }

    public String brake(){
        return "Car of type "+ getClass().getSimpleName() + " is braking";
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

}
