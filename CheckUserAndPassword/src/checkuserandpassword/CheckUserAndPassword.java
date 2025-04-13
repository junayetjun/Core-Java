
package checkuserandpassword;

import java.util.Scanner;


public class CheckUserAndPassword {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your User Name ");
        String userName = input.next();
        
       
        String[] names = {"Samim", "Junayet","Istiaq","Imaran","Sadiar"};
        
        int[] userNames = {123,125,127,129,131};
        
        
        
        for(int index = 0; index < userNames.length; index++){
        
            if(userName.equalsIgnoreCase(names[index])){                
                
                System.out.println("Enter your Password ");                
                int userPassword =input.nextInt();
                
                if(userPassword == userNames[index]){
                    System.out.println("Welcome you " + userName);                
                
                }
                else {
                    System.err.println("Password is not Right");
                }
                
            }
        
        
        
        }
        
    }
    
}
