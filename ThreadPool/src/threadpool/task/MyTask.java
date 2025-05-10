
package threadpool.task;



public class MyTask implements Runnable{
   
    private int taskId;

    public MyTask() {
    }

    public MyTask(int taskId) {
        this.taskId = taskId;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
         
        System.out.println("Task " + taskId + " is running on thread "+ Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Task " + taskId+ " was intrrupted " );
        }
        
        System.out.println("Task " + taskId + " completed by "+ Thread.currentThread().getName());
    
    
    }
    
    
    
}
