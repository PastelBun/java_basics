package week_2;
import java.util.Scanner;

public class Sum_of_Num {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int read = Integer.parseInt(reader.nextLine());
            if (read == 0) {
                break;
            }
            else {
                sum = sum + read;

                System.out.println("Sum now: " + sum);
            }
        }

        System.out.println("Sum in the end: " + sum);
    }
}
