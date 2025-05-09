
package collectionslistsort;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class CollectionsListSort {

    
    public static void main(String[] args) {
       
        long[] myArray = {10,5,4,8,2,7,9,6,3,1};
        
       Arrays.sort(myArray);
        
        //System.out.println(Arrays.toString(myArray));
        
        List<Integer> numbers = new LinkedList<>();
        
        numbers.add(4);
        numbers.add(8);
        numbers.add(5);
        numbers.add(1);
        numbers.add(10);
        numbers.add(7);
        numbers.add(12);
        numbers.add(6);
        numbers.add(2);
        
        Collections.sort(numbers);
        
        
        System.out.println(numbers);
        
    }
    
}
