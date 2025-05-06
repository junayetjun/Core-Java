package accountusingsubclassone.account;

public class Account {

    public String accountNumber;
    public double balance;

    public Account() {
    }

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {

        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawl Successfully. ");

        } else {
            System.out.println("Insuficient balance or Invalid amount. ");

        }

    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully. ");

        } else {
            System.out.println("Invalid deposit amount ");
        }

    }

    public void getAccountDetails() {

        System.out.println("Account number: " + accountNumber);
        System.out.println("Your main balance: $" + this.getBalance());

    }

}
