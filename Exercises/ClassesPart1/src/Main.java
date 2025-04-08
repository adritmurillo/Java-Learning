public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("Porsche");
        car.setColor("Red");
        car.setDoors(2);
        car.setModel("Second model");
        car.setConvertible(false);

        car.describeCar();

        Car targa = new Car();
        targa.setMake("Porsche");
        targa.setColor("Black");
        targa.setDoors(4);
        targa.setModel("Third model");
        targa.setConvertible(true);

        targa.describeCar();
    }
}
