
package threadpool;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import threadpool.task.MyTask;

public class ThreadPool {

    
    public static void main(String[] args) {
       
        
        ExecutorService excutor = Executors.newFixedThreadPool(4);
        
        for(int i =1; i <=5; i++){
            Runnable task = new MyTask(i);
            excutor.submit(task);
                
        }
        
        excutor.shutdown();
        
    }
    
}
