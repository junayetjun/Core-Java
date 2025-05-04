
package accountusingsubclass.account.Savings;

import accountusingsubclass.account.Account;



public class SavingAccount extends Account{
    
    public double deposit;

    public SavingAccount() {
    }

    public SavingAccount(double deposit) {
        this.deposit = deposit;
    }

    public SavingAccount(double deposit, long accountNumber, long balance) {
        super(accountNumber, balance);
        this.deposit = deposit;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    
    

    @Override
    public void getAccountDetailsOne() {
        super.getAccountDetailsOne(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        double totalBalance= deposit+balance;        
        
        System.out.println("Total Balance "+ totalBalance );
    }

    
    
     
    
}
