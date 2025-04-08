public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public Account() {
        this("5678", 3000.00, "Miguel", "miguel@gmail.com", "999 888 777");
        System.out.println("Empty constructor called");
    }

    public Account(String number, double balance, String customerName, String customerEmail, String customerPhone) {
        System.out.println("Account constructor called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }


    public Account(String customerName, String customerEmail, String customerPhone) {
        this("9999", 45.24, customerName, customerEmail, customerPhone);
//        this.customerPhone = customerPhone;
//        this.customerEmail = customerEmail;
//        this.customerName = customerName;
    }

    public void depositFunds(double depositAmount){
        balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New" +
                " balance is $" + balance);
    }

    public void withdrawFunds(double withdrawAmount){
        if (balance >= withdrawAmount){
            balance -= withdrawAmount;
            System.out.println("Withdrawal of $" + withdrawAmount + " completed" +
                    " New balance is $" + balance);
        } else {
            System.out.println("Insufficient Funds. Your balance is $" + balance);
        }
    }





    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
