
package accountusingsubclass.account;


public class Account {
    
    public double accountNumber;
    public double balance;

    public Account() {
    }

    public Account(long accountNumber, long balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
    
    
    public double getAccountDetails(){
        return balance;
    
    }
    
    public void getAccountDetailsOne(){
    
        System.out.println("Account Number: "+ accountNumber);
        System.out.println("Account Balance: "+ balance);
    }
    
}
