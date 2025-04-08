public class Main {
    public static void main(String[] args) {
        Account bobsAccount = new Account();
//        Account bobsAccount = new Account(
//                "12345",
//                10000.00,
//                "Bob Marston",
//                "myemail@gmail.com",
//                "999 999 999"
//        );
        System.out.println(bobsAccount.getBalance());
        System.out.println(bobsAccount.getNumber());
//        bobsAccount.setNumber("12345");
//        bobsAccount.setBalance(5000);
//        bobsAccount.setCustomerName("Bob Marston");
//        bobsAccount.setCustomerEmail("marston@gmail.com");
//        bobsAccount.setCustomerPhone("999999999");

        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depositFunds(200.0);
        bobsAccount.withdrawFunds(100.0);


        Account joaquinAccount = new Account("Joaquin", "joaquin@gmail.com", "12345");
        System.out.println("ACCOUNT NO: " + joaquinAccount.getNumber());
        System.out.println("BALANCE: " + joaquinAccount.getBalance());
        System.out.println("Name " + joaquinAccount.getCustomerName());
        System.out.println("Email " + joaquinAccount.getCustomerEmail());
        System.out.println("Phone " + joaquinAccount.getCustomerPhone());
    }
}
