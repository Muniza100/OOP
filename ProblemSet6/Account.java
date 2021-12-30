import java.util.Formatter;

public class Account {
    private final int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }
    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double amount) {
        this.balance = amount;
    }

    public void credit(double amount) {
        this.balance += amount;
    }
    public void debit(double amount) {
        if(amount > this.balance) {
            System.out.println("amount withdrawn exceeds the current balance!");
        }
        else {
            this.balance -= amount;
        }
    }

    public void print() {
        System.out.printf("A/C no: %d Balance=$%.2f%n", this.accountNumber, this.balance);
    }
    public String toString() {
        Formatter balanceToPrint = new Formatter();
        balanceToPrint.format("%.2f", this.balance);
        return "A/C no: " + this.accountNumber +
                " Balance=" + balanceToPrint;
    }
}