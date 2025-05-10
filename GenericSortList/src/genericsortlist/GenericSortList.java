
package genericsortlist;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class GenericSortList {

    
    public static void main(String[] args) {
      
        
        List<Integer> number = new LinkedList<>();
        
        number.add(5);
        number.add(4);
        number.add(10);
        number.add(2);
        number.add(7);
        
        
        
        System.out.println(number);
        Collections.sort(number);
        
        System.out.println(number);
        
        
        
        
        
    }
    
    
}
