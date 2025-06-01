package WorldPC;
import WorldPC.Model.Keyboard;
import WorldPC.Model.Mouse;
import WorldPC.Model.Monitor;
import WorldPC.Model.Computer;
import WorldPC.Service.Order;

public class Main{
    public static void main(String[] args) {

        Mouse razerMouse = new Mouse("Wireless", "Razer");

        Keyboard razerKeyboard = new Keyboard("Wire", "Razer");

        Monitor razerMonitor = new Monitor("Razer", 27.0);

        Computer razerComputer = new Computer("Razer", razerMonitor, razerKeyboard, razerMouse);

        Monitor dellMonitor = new Monitor("'Dell", 15.0);

        Keyboard dellKeyboard = new Keyboard("Wireless", "'Dell'");

        Mouse dellMouse = new Mouse("Wired", "Dell");

        Computer dellComputer = new Computer("Dell", dellMonitor, dellKeyboard, dellMouse);

        Monitor hpMonitor = new Monitor ("HP", 17.0);
        Keyboard hpKeyboard = new Keyboard("Wireless", "HP");
        Mouse hpMouse = new Mouse("Wireless", "HP");
        Computer hpComputer = new Computer("HP", hpMonitor, hpKeyboard, hpMouse);

        // Lets create an order

        Order firstOrder = new Order();
        firstOrder.addComputer(razerComputer);
        firstOrder.addComputer(dellComputer);
        firstOrder.showOrder();

        // Lets create another order

        Order secondOrder = new Order();
        secondOrder.addComputer(hpComputer);
        secondOrder.addComputer(dellComputer);
        secondOrder.addComputer(razerComputer);
        secondOrder.showOrder();
    }
}