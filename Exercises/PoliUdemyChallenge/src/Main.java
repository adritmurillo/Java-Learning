public class Main {
    public static void main(String[] args) {
        Car car = new Car(6, "Base Car");
        System.out.println(startCar(car));

        Car secondCar = new Mitsubishi(10, "Mitsubishi");
        System.out.println(startCar(secondCar));

        Car thirdCar = new Ford(8, "Ford");
        System.out.println(startCar(thirdCar));

        Car fourthCar = new Holden(12, "Holden");
        System.out.println(startCar(fourthCar));
    }









    public static String startCar(Car car){
        return car.startEngine() + "\n" +
                car.accelerate() + "\n" +
                car.brake() + "\n";
    }
}
