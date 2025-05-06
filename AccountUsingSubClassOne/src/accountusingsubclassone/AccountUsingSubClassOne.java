  
package accountusingsubclassone;

import accountusingsubclassone.account.currentandsavings.CurrentAccount;


public class AccountUsingSubClassOne {

    
    public static void main(String[] args) {
        
  
        CurrentAccount c = new CurrentAccount();
        
        c.setWithdraw(2000);
        c.getWithdraw();
        
        c.getAccountDetails();
        
    }
    
}
