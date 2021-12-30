public class AccountTest {
    public static void main(String[] args) {
        Account myFirstBankAccount = new Account(123456789, 12.5);
        System.out.println(myFirstBankAccount);
        System.out.println("Account number: " + myFirstBankAccount.getAccountNumber());
        System.out.println("Initial balance: $" + myFirstBankAccount.getBalance());
        myFirstBankAccount.setBalance(15);
        System.out.println("New set balance: $" + myFirstBankAccount.getBalance());
        myFirstBankAccount.debit(10.3);
        System.out.println(myFirstBankAccount);

        System.out.println();

        Account mySecondBankAccount = new Account(987654321);
        mySecondBankAccount.print();
        mySecondBankAccount.debit(1);
        mySecondBankAccount.credit(1.88);
        mySecondBankAccount.print();
    }
}
