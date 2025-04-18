public class Main {
    public static void main(String[] args) {
        Employee joaquin = new Employee("Joaquin", "28/08/2004",
                "14/02/2022");
        System.out.println(joaquin);
        System.out.println("Age: " + joaquin.getAge());
        System.out.println("Pay: " + joaquin.collectPay());

        SalariedEmployee martin = new SalariedEmployee("Martin", "15/05/2000",
                "14/02/2012", 35000);

        System.out.println(martin);
        System.out.println("Age: " + martin.getAge());
        System.out.println("Martin's salary: " + martin.collectPay());

        martin.retire();
        System.out.println("Martin's salary after retirement: " + martin.collectPay());

        HourlyEmployee maria = new HourlyEmployee("Maria", "01/01/1990", "15/06/2015", 20.0);
        System.out.println(maria);
        System.out.println("Pay: " + maria.collectPay());
        System.out.println("Double pay: " + maria.getDoublePay());

    }
}
