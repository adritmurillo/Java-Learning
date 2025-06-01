package WorldPC.Model;

public class Mouse extends InputDevice{
    private final int idMouse;
    private static int mouseCounter;

    public Mouse(String inputType, String brand){
        super(inputType, brand);
        idMouse = ++mouseCounter;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "idMouse=" + idMouse +
                "} " +super.toString();
    }
}
