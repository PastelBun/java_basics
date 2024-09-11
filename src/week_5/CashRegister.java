package week_5;

public class CashRegister {
    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        if (cashGiven>=2.5) {
            economicalSold += 1;
            cashInRegister += 2.5;
            return cashGiven-2.5;
        }
        else
            return cashGiven;
    }

    public double payGourmet(double cashGiven) {
        if (cashGiven>=4) {
            gourmetSold += 1;
            cashInRegister += 4;
            return cashGiven-4;
        }
        else
            return cashGiven;
    }
    public boolean payEconomical(LyyraCard card) {
        if(card.pay(2.5))  {
            economicalSold += 1;
            return true;
        }
        else
            return false;
    }

    public boolean payGourmet(LyyraCard card) {
        if(card.pay(4)) {
            gourmetSold += 1;
            return true;
        }
        else
            return false;
    }
    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum>0) {
            card.loadMoney(sum);
            cashInRegister += sum;
        }
    }

    public String toString() {
        return "money in register "+cashInRegister+" economical lunches sold: "+economicalSold+" gourmet lunches sold: "+gourmetSold;
    }
}
