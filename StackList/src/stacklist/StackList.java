
package stacklist;

import java.util.Stack;


public class StackList {

   
    public static void main(String[] args) {

        
        
        Stack<String> namesStact = new Stack<>();

        namesStact.push("Masud");
        namesStact.push("Imran");
        namesStact.push("Rakib");
        namesStact.push("Junayet");

        System.out.println(namesStact +"\n"+"------------------");
         //System.out.println(namesStact.peek());
        
        //namesStact.pop();

       // System.out.println(namesStact);
        
        System.out.println(namesStact.search("Junayet"));
        
        
    }
    
}
