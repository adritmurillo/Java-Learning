public class Motherboard extends Product{
    private int ramSlots;
    private int cardSlots;
    private String bios;
    private Dimensions dimensions;

    public Motherboard(String model, String manufacturer){
        super(model, manufacturer);
    }

    public Motherboard(String model, String manufacturer, int ramSlots,
                       int cardSlots, String bios, Dimensions dimensions){
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }
    public void loadProgram(String programName){
        System.out.println("Program " + programName + " is now loading...");
    }
}
