public class Musical extends Movie{
    public Musical(String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Nice characters",
                "Good music",
                "Happy ending");
    }
}
