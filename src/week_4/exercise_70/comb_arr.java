package week_4;

import java.util.ArrayList;

public class comb_arr {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list1.add(4);
        list1.add(2);
        list1.add(0);

        list2.add(6);
        list2.add(9);
        System.out.println(list1);
        System.out.println(list2);
        combine(list1, list2);
        System.out.println(list1);
        System.out.println(list2);
    }
    public static void combine (ArrayList < Integer > first, ArrayList < Integer > second){
        first.addAll(second);
    }
}
