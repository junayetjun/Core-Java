
package learningmethodoverloadingone;

import java.util.Arrays;



public class LearningMethodOverloadingTwo {

    
    public static void main(String[] args) {
        
        
       
        sum(10,20,30,40);
        
        
        
    }    
    
    
    public static void sum (int... a){
        int sum = 0 ;
        for ( int item : a){
            sum += item;        
        
        }
        System.out.println(Arrays.toString(a));
        System.out.println(sum);
        
        
    
    
    }
    
    
    
   
    
}
