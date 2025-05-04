
package vehiclesusingsubclass.vehicle;

public class Vehicle {
    
    public String brand;
    public long speed;

    public Vehicle() {
    }

    public Vehicle(String brand, long speed) {
        this.brand = brand;
        this.speed = speed;
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
    
    
    public void getVehiclesDetails(){
        System.out.println("Brand name: "+ brand);
        System.out.println("Speed: "+ speed);
    }
    
    
}
