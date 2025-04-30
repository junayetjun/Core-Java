
package mainclassclasstest.vehicle.Truck;

import mainclassclasstest.vehicle.Vehicle;


public class Truck extends Vehicle{
    //Using Normal Class
    private int weight;

    public Truck() {
    }

    public Truck(int weight) {
        this.weight = weight;
    }

    public Truck(int weight, int speed, double regularPrice, String color) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        if(weight > 2000){
        
        return regularPrice-(regularPrice*0.1);
        }
        else{
        return regularPrice;
        }
        
        
       }

   
    
    
    
    
}
