package learnsinglearray;

import java.util.Arrays;

public class LearnSingleArray {

    public static void main(String[] args) {

//        String[] names = new String[14];
//        int[] ages ={20,22,21,26,24,25,24,21,23,21};
//        
//        System.out.println(Arrays.toString(names));
//        System.out.println(Arrays.toString(ages));
//        
//        names[0]="Istiaq";
//        names[3]="Masud";
//        
//        System.out.println(Arrays.toString(names));

        String[] names = new String[5];
//        int[] ages = new int[5];
        int[] ages = {20, 25, 22, 24, 23};
        names[0] = "Istiaq";
        names[1] = "Atiq";
        names[2] = "Imran";
        names[3] = "Sadiar";
        names[4] = "Rahamat";

//        ages[0] = 20;
//        ages[1] = 25;
//        ages[2] = 22;
//        ages[3] = 24;
//        ages[4] = 23;
        for (int i = 0; i < names.length; i++) {
 
            System.out.println( i + 1 + "." + names[i] + " is " + ages[i] + " years old");
        }
           
    }

}
