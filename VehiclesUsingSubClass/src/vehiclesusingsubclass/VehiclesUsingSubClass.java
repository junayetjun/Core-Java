
package vehiclesusingsubclass;

import vehiclesusingsubclass.vehicle.carandbike.Bike;
import vehiclesusingsubclass.vehicle.carandbike.Car;


public class VehiclesUsingSubClass {

    
    public static void main(String[] args) {
        
        Car c = new Car("Two", "BMW", 3500);
        c.getVehiclesDetails();
        
        System.out.println("----------------------------------");
        
        Bike b = new Bike("Yes", "Kawasaki", 450);
        b.getVehiclesDetails();
        
        
    }
    
}
