
package multidimentionalbubblesort;


public class MultiDimentionalBubbleSort {

    
    
    public static void main(String[] args) {
       
       int[][] matrix = {
            {4, 2, 3, 6, 4},
            {10, 15, 19, 12},
            {35, 28, 9, 3, 15,}
        };

        
        System.out.println("2D Array (Matrix):");
        for (int i = 0; i < matrix.length; i++) {        
            for (int j = 0; j < matrix[i].length; j++) {  
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); 
        }
        
        
    }
    
}
