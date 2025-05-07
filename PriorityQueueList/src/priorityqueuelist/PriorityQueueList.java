
package priorityqueuelist;

import java.util.PriorityQueue;


public class PriorityQueueList {

    
    public static void main(String[] args) {
       
        PriorityQueue<Double> prices = new PriorityQueue<>();
        
        prices.offer(5.5);
        prices.offer(10.5);
        prices.offer(20.5);
        prices.offer(30.5);
        prices.offer(40.5);
        prices.offer(50.5);
        
        System.out.println(prices);
        
        prices.remove();
        
        System.out.println(prices);
        
        
        
    }
    
}
