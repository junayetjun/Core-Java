
package accountusingsubclass;

import accountusingsubclass.account.Savings.CurrentAccount;
import accountusingsubclass.account.Savings.SavingAccount;


public class AccountUsingSubClass {

    
    public static void main(String[] args) {
       
        
        SavingAccount s = new SavingAccount(12000,111 ,15000);        
        s.getAccountDetailsOne();
        
        System.out.println("----------------");
        
        CurrentAccount c = new CurrentAccount(5000, 111, 15000);
        c.getAccountDetailsOne();
        
       
        
        
//        CurrentAccount c = new CurrentAccount();
//        
//        c.setBalance(15000);
//        c.getAccountDetailsOne();
//        System.out.println("----------------");
//        c.setBalance(10000);
//        c.getAccountDetailsOne();
//        
    }
    
}
