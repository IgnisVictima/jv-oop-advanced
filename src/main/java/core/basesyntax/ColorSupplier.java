package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    
    String[] colors = new String[] {"blue", "yellow", "red",  "black",  "pink",  "orange", "white"}; 

    Random random = new Random(); 

    public String getRandomColor() {

        return colors[random.nextInt(colors.length)];

    }

}
