package accountusingsubclassone.account.currentandsavings;

import accountusingsubclassone.account.Account;

public class CurrentAccount extends Account {

    public double overDraftLimit;

    public CurrentAccount() {
    }

    public CurrentAccount(double withdraw) {
        this.overDraftLimit = withdraw;
    }

    public CurrentAccount(double withdraw, String accountNumber, double balance) {
        super(accountNumber, balance);
        this.overDraftLimit = withdraw;
    }

    public double getWithdraw() {
        return overDraftLimit;
    }

    public void setWithdraw(double withdraw) {
        this.overDraftLimit = withdraw;
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

    @Override
    public void withdraw(double amount) {
        double balance = super.getBalance();

        if (amount > 0 && balance + overDraftLimit >= amount) {
            balance -= amount;

            super.setBalance(balance);
            System.out.println(amount + " withdrawn successfully (with overdraft if needed )");
        } else {

            System.out.println("Withdrawal exceeds overdraft limit or invalid amount ");
        }
    }

    @Override
    public void getAccountDetails() {
        super.getAccountDetails();
        System.out.println("Overdraftlimit: $" + overDraftLimit);
    }
    
}


