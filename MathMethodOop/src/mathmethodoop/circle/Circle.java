
package mathmethodoop.circle;

import mathmethodoop.methods.MethodShape;


public class Circle extends MethodShape{
   
    private int radius;

    public Circle() {
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double findingArea() {
       
      return this.radius= (int) (Math.PI* Math.pow(this.radius, 2)); 
        
    }

    
    
    
    
    
    
}
