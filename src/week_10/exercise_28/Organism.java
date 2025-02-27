package week_10.exercise_28;

public class Organism implements Movable {
    int x;
    int y;
    public Organism(int x, int y) {
        this.x=x;
        this.y=y;
    }
    public String toString() {
        return "x: " + x + "; y: " + y;
    }
    @Override
    public void move(int dx, int dy) {
        x+=dx;
        y+=dy;
    }
}
