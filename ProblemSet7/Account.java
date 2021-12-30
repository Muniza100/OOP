public class Account {
    private int id;
    private Customer customer;
    private double balance;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }
    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
        this.balance = 0.0;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        double twoDecimalBalance = (int) (this.balance * 100);
        return this.customer.toString() + "balance=$" + twoDecimalBalance / 100;
    }

    public String getCustomerName() {
        return this.customer.getName();
    }

    public void deposit(double amount) {
        this.balance += amount;
    }
    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        }
        else {
            System.out.println("Amount withdrawn exceeds the current balance!");
        }
    }
}
