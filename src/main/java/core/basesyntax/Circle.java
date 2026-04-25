package core.basesyntax;

public class Circle extends Figure {
    int radius;

    public Circle(int radius, String color){

        this.radius = radius;
        this.color = color; 
    }


    @Override
    public
    double getArea() {

        return Math.round((radius * radius * Math.PI)*100) / 100;
        
    }

    @Override
    public
    
    void draw() {

        System.out.println("Figure: " + "circle, " + "area: " + getArea() + " sq. units, radius: " + radius + " units, color: " + color);
        
    } 
}
