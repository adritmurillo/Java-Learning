public class DishWasher {
    private boolean hasWorkToDo;

    public DishWasher(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean getHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void doDishes(){
        if (getHasWorkToDo()) {
            System.out.println("Doing dishes...");
            setHasWorkToDo(false);
        } else {
            System.out.println("No work to do.");
        }
    }
}
