package week_10.exercise_29__People;

public class Teacher extends Person{
    public int salary;
    public Teacher(String name, String address, int salary) {
        super(name, address);
        this.salary=salary;
    }
    public String toString() {
        return name + "\n" + "  " + address + "\n" + "  salary " + salary + " euros/month";
    }
}
