package WorldPC.Model;

public class Computer {
    private int idComputer;
    private String name;
    private Monitor monitor;
    private Keyboard keyboard;
    private Mouse mouse;
    private static int computerCounter;

    public Computer(){
        idComputer = ++computerCounter;
    }
    public Computer(String name, Monitor monitor, Keyboard keyboard, Mouse mouse){
        this();
        this.name = name;
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    @Override
    public String toString() {
        return "Computer{\n" +
                "idComputer=" + idComputer +
                ", name='" + name + '\'' +
                "\n , monitor=" + monitor +
                "\n , keyboard=" + keyboard +
                "\n , mouse=" + mouse +
                '}';
    }
}
