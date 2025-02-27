package week_10.exercise_28;

import java.util.HashSet;

public class Group implements Movable{
    HashSet<Movable> group;
    public Group(){
        this.group = new HashSet<>();
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Movable movable : group) {
            result.append(movable.toString()).append("\n");
        }
        return result.toString();
    }
    public void addToGroup(Movable movable) {
        this.group.add(movable);
    }
    @Override
    public void move(int dx, int dy) {
        for (Movable movable : group) {
            movable.move(dx, dy);
        }
    }
}
