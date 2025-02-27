package week_9.exercise_18.moving.logic;

import week_9.exercise_18.Thing;
import week_9.exercise_18.moving.domain.Box;

import java.util.ArrayList;
import java.util.List;

public class Packer {
    private final int boxesVolume;
    public Packer(int boxesVolume){
        this.boxesVolume=boxesVolume;
    }
    public List<Box> packThings(List<Thing> things) {
        List<Box> boxes = new ArrayList<>();
        Box currentBox = new Box(boxesVolume);
        for (Thing thing : things) {
            if (!currentBox.addThing(thing)) {
                boxes.add(currentBox);
                currentBox = new Box(boxesVolume);
                currentBox.addThing(thing);
            }
        }
        if (currentBox.getVolume() > 0) {
            boxes.add(currentBox);
        }
        return boxes;
    }
}
