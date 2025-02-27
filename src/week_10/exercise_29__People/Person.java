package week_10.exercise_29__People;

public class Person {
    public String name;
    public String address;
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public String toString() {
        return name + "\n" + "  " + address;
    }
}
