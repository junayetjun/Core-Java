
package classandobjectcircle.lclass;


public class Circle {
    
    double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double getArea(){
        double area = Math.PI * Math.pow(this.radius,2);  
    
        return area;
    }
    public double getPreimeter(){
    
        double preimeter = 2 * Math.PI * radius;
        
        return preimeter;
    
    }
    
    public void setRadious(double newRadius){
        this.radius= (int) newRadius; 
    
    
    }
    
    
    
    
}
