public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;

    public Bed(String style, int pillows, int height, int sheets, int quilt){
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    public void make(){
        System.out.println("Bed -> Making");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void setPillows(int pillows) {
        this.pillows = pillows;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setSheets(int sheets) {
        this.sheets = sheets;
    }

    public void setQuilt(int quilt) {
        this.quilt = quilt;
    }
}
