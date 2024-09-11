package week_3;
import java.util.Scanner;

public class sep_char {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String read = reader.nextLine();
        int i=0;
        while (read.length() != i) {
            System.out.println((i+1)+". character: "+ read.charAt(i));
            i++;
        }
    }
}
