public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen() {
        this.brewMaster = new CoffeeMaker(false);
        this.dishWasher = new DishWasher(false);
        this.iceBox = new Refrigerator(false);
    }

    public SmartKitchen(CoffeeMaker brewMaster, DishWasher dishWasher, Refrigerator iceBox) {
        this.brewMaster = brewMaster;
        this.dishWasher = dishWasher;
        this.iceBox = iceBox;
    }
    public void addWater(){
        brewMaster.setHasWorkToDo(true);
    }
    public void pourMilk(){
        iceBox.setHasWorkToDo(true);
    }

    public void loadDishWasher(){
        dishWasher.setHasWorkToDo(true);
    }

    public void setKitchenState(boolean brewMasterState, boolean dishWasherState, boolean iceBoxState){
        brewMaster.setHasWorkToDo(brewMasterState);
        dishWasher.setHasWorkToDo(dishWasherState);
        iceBox.setHasWorkToDo(iceBoxState);
    }

    public void doKitchenWork(){
        brewMaster.brewCoffee();
        dishWasher.doDishes();
        iceBox.orderFood();
    }

}
