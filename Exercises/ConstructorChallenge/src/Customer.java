public class Customer {
    // These are our attributes
    private String name;
    private double creditLimit;
    private String email;

    public Customer(){
        this("Nobody", "nobody@gmail.com");
    }
    public Customer(String name, String email){
        this(name, 3000.00, email);
    }
    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }



    // These are our getters
    public String getName(){
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
