public class Main {
    public static void main(String[] args) {
        Car car = new Car("Chevrolet Impala 1967");
        runRace(car);

        Car ferrari = new GasPoweredCar("Ferrari 488 GTB", 10.0, 8);
        runRace(ferrari);

        Car tesla = new ElectricCar("Tesla Model S", 15.0, 100);
        runRace(tesla);

        Car toyota = new Hybrid("Toyota Prius", 20.0, 4, 50);
        runRace(toyota);
    }
    public static void runRace(Car car){
        car.startEngine();
        car.drive();
    }


}
