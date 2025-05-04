
package vehiclesusingsubclass.vehicle.carandbike;

import vehiclesusingsubclass.vehicle.Vehicle;


public class Car extends Vehicle{
    public String numberOfDoors;

    public Car() {
    }

    public Car(String numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public Car(String numberOfDoors, String brand, long speed) {
        super(brand, speed);
        this.numberOfDoors = numberOfDoors;
    }

    public String getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(String numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
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
        System.out.println("Doors Number: "+numberOfDoors);
    }
    
    
    
    
}
