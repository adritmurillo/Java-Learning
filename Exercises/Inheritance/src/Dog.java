public class Dog extends Animal{
    private String earShape;
    private String tailShape;

    public Dog(){
        super("Mutt" , "Big", 20.0);
    }

    public Dog(String type, double weight){
        this(type, weight, "Perky", "Curled");
    }



    public Dog(String type, double weight, String earShape,
               String tailShape) {
        super(type, weight < 15 ? "Small" : (weight < 35 ? "Medium" : "Large"),
                weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise(){
        if (type == "wolf"){
            System.out.println("Howl");
        }
        

        bark();
        System.out.println();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        // System.out.println("Dogs walk, runs and wiggle their tails");

        if (speed == "slow"){
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
        System.out.println();
    }
    private void bark(){
        System.out.print("Woof Woof");
    }

    private void run(){
        System.out.print("Dog running");
    }

    private void walk(){
        System.out.print("Dog walking");
    }

    private void wagTail(){
        System.out.print("Tail Wagging");
    }


}
