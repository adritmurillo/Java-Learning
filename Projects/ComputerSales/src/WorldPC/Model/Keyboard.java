package WorldPC.Model;

public class Keyboard extends InputDevice{
    private final int idKeyboard;
    private static int keyboardCounter;

    public Keyboard(String inputType, String brand){
        super(inputType, brand);
        idKeyboard = ++keyboardCounter;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "idKeyboard=" + idKeyboard +
                "} " +super.toString();
    }
}
