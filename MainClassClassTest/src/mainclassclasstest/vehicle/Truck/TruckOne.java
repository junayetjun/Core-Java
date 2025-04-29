/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainclassclasstest.vehicle.Truck;

import mainclassclasstest.vehicle.VehicleOne;

/**
 *
 * @author Admin
 */
public class TruckOne extends VehicleOne{
    
    private int weight;

    public TruckOne() {
    }

    public TruckOne(int weight) {
        this.weight = weight;
    }

    public TruckOne(int weight, int speed, double regularPrice, String color) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    @Override
    public  void setWeight(int weight){
        this.weight = weight;
    }



    @Override
    public double getSalePriceOne() {

        
        if(weight > 2000){
             return regularPrice - (regularPrice * 0.1);       
        }
        else{
            return regularPrice;
        }
        
        
     }
    
    
    
    
    
}
