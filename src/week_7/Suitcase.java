package week_7;

import java.util.ArrayList;

public class Suitcase {
    private final ArrayList<Thing>things;
    private int totalweight;
    private final int weight_lim;
    Suitcase(int weight_lim) {
        things=new ArrayList<>();
        this.weight_lim=weight_lim;
    }
    public void addThing(Thing thing) {
        if (totalweight+ thing.getWeight()<=weight_lim) {
            things.add(thing);
            totalweight += thing.getWeight();
        }
    }
    public String toString() {
        if (things.isEmpty()) {
            return "empty";
        }
        else if (things.size()==1) {
            return things.size() + " thing (" + totalweight + " kg)";
        }
        else {
            return things.size() + " things (" + totalweight + " kg)";
        }
    }
    public void printThings() {
        for (Thing thing : things) {
            System.out.println(thing);
        }
    }
    public int totalWeight() {
        return totalweight;
    }
    public Thing heaviestThing() {
        if (things.isEmpty()) {
            return null;
        }


        Thing heaviestThing = things.get(0);
        for (Thing thing : things) {
            if (thing.getWeight() > heaviestThing.getWeight()) {
                heaviestThing = thing;
            }
        }

        // Return the heaviest item as a string
        return heaviestThing;
    }
}
