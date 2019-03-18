public class Customer {

    private double balance;
    private String password;
    private int customerNr;
    private static int currentCustomerNr = 0;

    public Customer(){
        balance = 0;
        password = "";
        customerNr = ++currentCustomerNr;
    }

    public Customer(double balance, String password){
        this.balance = balance;
        this.password = password;
        customerNr = ++currentCustomerNr;
    }

    public double getBalance() {
        return balance;
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCustomerNr() {
        return customerNr;
    }

    public void setCustomerNr(int customerNr) {
        this.customerNr = customerNr;
    }

    public static int getCurrentCustomerNr() {
        return currentCustomerNr;
    }

    public static void setCurrentCustomerNr(int currentCustomerNr) {
        Customer.currentCustomerNr = currentCustomerNr;
    }

}
