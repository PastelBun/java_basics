package week_1;
import java.util.Random;
import java.util.Scanner;

public class guess_game {
    public static void main(String[] args) {
        Random rand = new Random();
        int rand_num= rand.nextInt(101);
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your guess: ");
        int count=0;
        while (true) {
            int read = Integer.parseInt(reader.nextLine());
            count++;
            if (read == rand_num) {
                System.out.println("Congratulations! You won in "+count+" guesses.");
                break;
            } else if (read > rand_num) {
                System.out.println("The number is lesser, you have made "+count+" guesses.");
            } else{
                System.out.println("The number is greater, you have made "+count+" guesses.");

            }
        }
    }
}
