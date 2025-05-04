
package accountusingsubclass.account.Savings;

import accountusingsubclass.account.Account;



public class CurrentAccount extends Account{
    
    public double withdraw;

    public CurrentAccount() {
    }

    public CurrentAccount(double withdraw) {
        this.withdraw = withdraw;
    }

    public CurrentAccount(double withdraw, long accountNumber, long balance) {
        super(accountNumber, balance);
        this.withdraw = withdraw;
    }

    public double getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
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
        double overDraftLimit;
        if(withdraw<= 5000){
            double afterWithdraw= balance-withdraw;
            
            System.out.println("After Withdraw: "+ afterWithdraw);
            System.out.println("Thank You");
        }
        else{
            System.out.println("You cant make more withdraw.");
        }
        
       
    }
    
    
    
    
}
