public class MyClass {
    public static void main(String[] args) {
        double firstDouble = 20.00;
        double secondDouble = 80.00;
        double total = (firstDouble + secondDouble) * 100.00;
        System.out.println("Total: "+total);
        double remainderTotal = total%=40.00;
        System.out.println("The remainder is: "+remainderTotal);
        boolean isZero = remainderTotal == 0 ? true : false;
        System.out.println("noRemainder: "+isZero);
        if (!isZero){
            System.out.println("Got some remainder");
        }
    }
}
