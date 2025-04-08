public class Car {
    // Atributos de la clase como su marca, modelo, color, etc.
    private String make;
    private String model;
    private int doors;
    private String color;
    private boolean convertible;

    // Metodo que imprime los valores del objeto
    public void describeCar(){
        System.out.println(doors + "-Doors" +
                " " + color + " " + make + " " + model + " " +
                (convertible ? "convertible" : "not convertible"));
    }

    // Estos son nuestros getters para trabajar con los atributos
    // fuera de la clase

    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getDoors() {
        return doors;
    }

    public String getColor() {
        return color;
    }

    public boolean isConvertible() {
        return convertible;
    }

    // Aca podremos los setters para que el usuario ponga
    // lo que quiera

    public void setMake(String newMake){
        if (newMake == null) newMake = "Unknown";
        String lowercaseMake = newMake.toLowerCase();
        switch (lowercaseMake){
            case "holden", "tesla", "porsche" -> this.make = newMake;
            default -> {
                this.make = "Unsupported";
            }
        }
    }

    public void setModel(String newModel){
        this.model = newModel;
    }

    public void setDoors(int newDoors){
        this.doors = newDoors;
    }

    public void setColor(String newColor){
        this.color = newColor;
    }

    public void setConvertible(boolean newConvertible){
        this.convertible = newConvertible;
    }
}
