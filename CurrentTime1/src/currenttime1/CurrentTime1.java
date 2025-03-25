
package currenttime1;


public class CurrentTime1 {

   
    public static void main(String[] args) {
        
        long time = System.currentTimeMillis();
        System.out.println(time);
        
        long totalSeconds = time/1000;
        
        long hours = totalSeconds / 3600;
        long remainingSeconds = totalSeconds % 3600;
        
        long minutes = remainingSeconds/60;
        long seconds = remainingSeconds% 60;
        
        long currentHours = ((hours+6)%24);
        
        System.out.println(currentHours+ " hours"+ minutes +" minutes" + seconds + " seconds BD");
        
        
    }
    
}
