public class Main {
    public static void main(String[] args) {
        MealOrder secondMeal = new MealOrder("Turkey", "Pepsi", "Onion Rings");
        secondMeal.addBurgerToppings("Lettuce", "Cheese", "Avocado");
        secondMeal.setDrinkSize("SMALL");
        secondMeal.printItemizedList();
    }
}
