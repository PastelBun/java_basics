package week_4;

public class DecreasingCounter {
    private int value;   // object variable that remembers the value of the counter
    private int initValue;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.initValue = valueAtStart;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        if(value-1>=0)
            value=value-1;
    }
    public void reset() {
        value=0;
    }
    public void setInitial() {
        value=initValue;
    }
}
