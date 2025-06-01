public class Refrigerator {
    private boolean hasWorkToDo;

    public Refrigerator(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean getHasWorkToDo() {
        return hasWorkToDo;
    }
    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood(){
        if (getHasWorkToDo()) {
            System.out.println("Ordering food...");
            setHasWorkToDo(false);
        } else {
            System.out.println("No work to do.");
        }
    }

}
