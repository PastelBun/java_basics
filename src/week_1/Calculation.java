package week_1;

public class Calculation {
    public static void main (String[] args){
        int first=6;
        int second=7;
        System.out.println(first+second);
        int calcWithParens= 1+1+3*(first+second);
        System.out.println(calcWithParens);
        int calcWithoutParens=1+1;
        calcWithoutParens=calcWithoutParens+3*first;
        calcWithoutParens=calcWithoutParens+second;
        System.out.println(calcWithoutParens);

    }
}
