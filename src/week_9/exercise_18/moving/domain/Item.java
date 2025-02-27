package week_9.exercise_18.moving.domain;

import week_9.exercise_18.Thing;

public class Item implements Thing, Comparable<Item>{
    private final String name;
    private final int volume;
    public Item(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return name + " (" + volume + " dm^3)";
    }
    public int getVolume() {
        return volume;
    }
    @Override
    public int compareTo(Item other) {
        return this.volume - other.volume;
    }
}
