package week_5;

public class Counter_Main {
    public static void main(String[] args) {

        Counter bob = new Counter(160);
        Counter frank= new Counter(69, true);
        Counter gerald= new Counter();
        Counter cat= new Counter(true);
        bob.increase();
        frank.decrease();
        gerald.increase();
        cat.decrease();
        cat.value();
        bob.value();
        frank.value();
        gerald.value();
        System.out.println(bob);
        System.out.println(frank);
        System.out.println(gerald);
        System.out.println(cat);
        bob.increase(50);
        frank.decrease(50);
        gerald.increase(50);
        cat.decrease(50);
        cat.value();
        bob.value();
        frank.value();
        gerald.value();
        System.out.println(bob);
        System.out.println(frank);
        System.out.println(gerald);
        System.out.println(cat);
        bob.decrease(220, true);
        frank.decrease(50);
        gerald.decrease(60, false);
        cat.increase(66);
        cat.decrease(50, false);
        bob.value();
        frank.value();
        gerald.value();
        cat.value();
        System.out.println(bob);
        System.out.println(frank);
        System.out.println(gerald);
        System.out.println(cat);


    }
}
