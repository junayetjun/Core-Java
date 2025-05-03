package learnrecursionmethods;

public class LearnRecursionMethods {

    public static void main(String[] args) {

//        System.out.println(factorial(0));
        for (long i = 1; i <= 7
                ; i++) {
            System.out.print(fibonacci((int) i) + " ");
        }
        System.out.println();

        System.out.println(fibonacci(7));


    }
    
    
    //     public static long factorial (int n){
//    
//    if( n == 0){
//        return 1;
//    }
//    else{
//    return n * factorial(n - 1);
//    }
//    
//    }
    
    
    
    
    
 public static long fibonacci(int f) {
        if (f == 0) {
            return 0;
        }
        if (f ==1){
            return 1;
        }

        return fibonacci(f - 1) + fibonacci(f - 2);

 
    }   
    
    
    
    
    

}



   
    
    
    

