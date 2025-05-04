
package vehiclesusingsubclass.vehicle.carandbike;

import vehiclesusingsubclass.vehicle.Vehicle;



public class Bike extends Vehicle{
   
    public String hasCarrier;

    public Bike() {
    }

    public Bike(String hasCarrier) {
        this.hasCarrier = hasCarrier;
    }

    public Bike(String hasCarrier, String brand, long speed) {
        super(brand, speed);
        this.hasCarrier = hasCarrier;
    }

    public String getHasCarrier() {
        return hasCarrier;
    }

    public void setHasCarrier(String hasCarrier) {
        this.hasCarrier = hasCarrier;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public long getSpeed() {
        return speed;
    }

    public void setSpeed(long speed) {
        this.speed = speed;
    }

    @Override
    public void getVehiclesDetails() {
        super.getVehiclesDetails(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Carrier: "+hasCarrier);
    }
    
    
    
    
    
}
