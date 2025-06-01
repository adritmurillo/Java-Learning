package WorldPC.Model;

public class Monitor {
    private final int idMonitor;
    private String brand;
    private double size;
    private static int monitorCounter;

    private Monitor(){
        idMonitor = ++monitorCounter;
    }

    public Monitor(String brand, double size){
        this();
        this.brand = brand;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "idMonitor=" + idMonitor +
                ", brand='" + brand + '\'' +
                ", size=" + size +
                '}';
    }
}
