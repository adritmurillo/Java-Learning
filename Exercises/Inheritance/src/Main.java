public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Random animal", "Medium", 50.0);
        doAnimalStuff(animal, "Fast");

        Dog dog = new Dog();
        doAnimalStuff(dog, "Slow");

        Dog yorkie = new Dog("Yorkie", 15);
        doAnimalStuff(yorkie, "Fast");

        Dog retriever = new Dog("Labrador Retriever", 65, "Floppy", "Swimmer");
        doAnimalStuff(retriever, "Slow");

        Dog wolf = new Dog("wolf", 40);
        doAnimalStuff(wolf, "slow");

        Fish goldie = new Fish("GoldFish", 0.25, 2, 3);
        doAnimalStuff(goldie, "slow");
    }

    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("====================================");
    }
}
