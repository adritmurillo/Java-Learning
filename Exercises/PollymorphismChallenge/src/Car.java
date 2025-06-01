public class Car {
    private String description;

    public Car (String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Engine started");
    }

    protected void runEngine(){
        System.out.println("Engine is running");

    }
    public void drive(){
        System.out.println("Car is driving, type is "+ getClass().getSimpleName());
        runEngine();
    }



}
