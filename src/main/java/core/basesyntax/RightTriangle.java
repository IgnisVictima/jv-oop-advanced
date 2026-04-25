package core.basesyntax;

public class RightTriangle extends Figure {

    int firstLeg, secondLeg; 
    public RightTriangle(int firstLeg, int secondLeg, String color){


        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;         

    }

    @Override
    public
    double getArea() {
       
        return firstLeg * secondLeg / 2.0;

    }

    @Override
    public
    void draw() {
        
        System.out.println("Figure: " + "right triangle, " + "area: " + getArea() + " sq. units, first leg: " + firstLeg + " units, second leg: " + secondLeg + " units, color: " + color);

    }
    
}
