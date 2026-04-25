package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
        Random random = new Random(); 
        ColorSupplier colorSupplier = new ColorSupplier(); 
    

    public Figure getRandomFigure() {

        switch (random.nextInt(5)) {
            case 0:

               return new Circle(random.nextInt(10) + 1, colorSupplier.getRandomColor());
                
            case 1:
                
                return new Square(random.nextInt(10) + 1, colorSupplier.getRandomColor()); 
            
            case 2:
                
                return new RightTriangle(random.nextInt(10) + 1, random.nextInt(10), colorSupplier.getRandomColor());

            case 3:
                
                return new Rectangle(random.nextInt(10) + 1, random.nextInt(10), colorSupplier.getRandomColor());

            case 4:
                
                return new IsoscelesTrapezoid(random.nextInt(10) + 1, random.nextInt(10), random.nextInt(10), colorSupplier.getRandomColor());


            default:

                return new Circle(random.nextInt(10) + 1, colorSupplier.getRandomColor());
           
        }

    }

    public Figure getDefaultFigure() {

        return new Circle(10, "white"); 
 
    }
    
}
