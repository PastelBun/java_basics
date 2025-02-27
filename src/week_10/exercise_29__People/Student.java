package week_10.exercise_29__People;

public class Student extends Person {
    public int credits;
    public Student(String name, String address) {
        super(name, address);
        this.credits=0;
    }
    public String toString() {
        return name + "\n" + "  " + address + "\n" + "  credits " + credits;
    }
    public void study() {
        credits++;
    }
}
