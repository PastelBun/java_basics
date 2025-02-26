package week_8.exercise_10;

public class CivilService implements NationalService {
    private int daysLeft;

    public void setDaysLeft(int daysLeft) {
        this.daysLeft = daysLeft;
    }

    public int getDaysLeft() {
        return this.daysLeft;
    }

    public void work() {
        if (this.daysLeft > 0) {
            this.daysLeft--;
        }
    }
}
