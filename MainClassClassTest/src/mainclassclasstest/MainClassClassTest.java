
package mainclassclasstest;


import mainclassclasstest.vehicle.Truck.Truck;
import mainclassclasstest.vehicle.Truck.TruckOne;
import mainclassclasstest.vehicle.VehicleOne;


public class MainClassClassTest {

   
    public static void main(String[] args) {
        
//        VehicleOne s = new TruckOne() ;
//        s.setRegularPrice(100);
//        s.setWeight(2001);
//        System.out.println(s.getSalePriceOne());
//        System.out.println(s.regularPrice);
       

        Truck tr = new Truck();
        tr.setRegularPrice(100);
        tr.setWeight(2500);
        System.out.println(tr.getSalePrice());
        
        
        
        
    }
    
}
