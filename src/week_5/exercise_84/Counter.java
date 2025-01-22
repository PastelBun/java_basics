package week_5;

public class Counter {
    private int count;
    private boolean check;
    // Constructors
    public Counter(int value) {
        this.count = value;
        this.check = false;
    }

    public Counter(int value, boolean check) {
        this.count = value;
        this.check = check;
    }

    public Counter() {
        this(0);  // Default to 0
    }

    public Counter(boolean check) {
        this(0, check);  // Default to 0, but with a check
    }

    // Increase method
    public void increase() {
        this.count++;
    }

    public void decrease() {
        if (this.count-1>= 0)
            this.count--;
    }
    public void increase(int value) {
        this.count += value;
    }
    public void decrease(int value) {
        if (this.count-value >= 0)
            this.count -= value;
    }
    public void decrease(int value, boolean check){
        if (this.count-value >= 0) {
            this.count -= value;
        }
        else if (check) {
                this.count = 0;
            }
    }
    public int value() {
        return this.count;
    }
    @Override
    public String toString() {
        return "Counter value: " + this.count;
    }
}

