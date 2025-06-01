public class Comedy extends Movie{
    public Comedy(String title){
        super(title);
    }

    @Override

    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Funny scene",
                "Vibrant music",
                "Happy ending");
    }
}
