package week_3;

import java.util.Scanner;

public class first_part {
    public static void main(String[] args) {
        Scanner word_reader = new Scanner(System.in);
        System.out.print("Type a word: ");
        String word = word_reader.nextLine();
        Scanner int_reader = new Scanner(System.in);
        System.out.print("Length of the first part: ");
        String temp = int_reader.nextLine();
        int i=Integer.parseInt(temp);
        System.out.println(word.substring(0,i));
    }
}
