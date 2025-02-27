package week_9.exercise_18.moving.domain;

import week_9.exercise_18.Thing;

import java.util.ArrayList;
import java.util.List;

public class Box implements Thing{
    private final int maximumCapacity;
    private int usedCapacity;
    private final List<Thing> things;

    public Box(int maximumCapacity){
        this.maximumCapacity = maximumCapacity;
        this.usedCapacity =0;
        this.things = new ArrayList<>();
    }
    public boolean addThing(Thing thing){
        if (this.usedCapacity + thing.getVolume() > this.maximumCapacity) {
            return false;
        }
        this.things.add(thing);
        this.usedCapacity += thing.getVolume();
        return true;
    }
    @Override
    public int getVolume(){
        return usedCapacity;
    }
    @Override
    public String toString(){
        return "  things in the box: " + usedCapacity + " dm^3)";
    }
}
