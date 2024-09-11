package week_5;

public class LyyraCard {
    private double balance;

    public LyyraCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void loadMoney(double amount) {
        this.balance += amount;
    }

    public boolean pay(double amount){
        if (amount < this.balance){
            balance -= amount;
            return true;
        }
        else
            return false;
    }
}
