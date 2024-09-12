package week_7;
import java.util.random.*;

public class Container_Main {
    public static void main(String[] Container) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        int i = 0;          // Counter for suitcases
        int totalWeight = 0; // Track the total weight in the container

        // Loop to add up to 100 suitcases (or stop when max weight is reached)
        while (i < 100) {
            // Calculate brick weight (4 kg per suitcase, incrementally increasing)
            int brickWeight =  Math.min( i + 1, 100);

            // Stop if adding the next suitcase would exceed 1000 kg
            if (totalWeight + brickWeight > 1000) {
                break;
            }

            // Create a new brick with the calculated weight
            Thing brick = new Thing("Brick", brickWeight);

            // Create a new suitcase with max capacity of 100 kg
            Suitcase suitcase = new Suitcase(100);

            // Add the brick to the suitcase
            suitcase.addThing(brick);

            // Add the suitcase to the container
            container.addSuitcase(suitcase);

            // Update total weight in the container
            totalWeight += brickWeight;

            // Increment the suitcase counter
            i++;
        }
    }
}
