public class Main {
    public static void main(String[] args) {
        ComputerCase myCase = new ComputerCase("2208", "Dell",
                "250W");

        Monitor myMonitor = new Monitor("27 inch Beast", "Acer",
                27, "2560x1440");

        Motherboard myMotherboard = new Motherboard("BJ-200", "Asus",
                4, 6, "v2.44");

        PersonalComputer myPC = new PersonalComputer("2208", "Dell",
                myCase, myMonitor, myMotherboard);

//        myPC.getMonitor().drawPixelAt(1500, 1200, "red");
//        myPC.getMotherboard().loadProgram("Windows 1.0");
//        myPC.getComputerCase().pressPowerButton();

        myPC.powerUp();
    }
}
