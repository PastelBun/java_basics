package week_7;

import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader=reader;
        this.dictionary= dictionary;
    }
    public void start(){
        label:
        while (true) {
            System.out.println("Statments:");
            System.out.println("add - adds a word pair to the dictionary");
            System.out.println("translate - asks a word and prints its translation");
            System.out.println("quit - quits the text user interface");
            System.out.print("Statement: ");
            String command = reader.nextLine();

            switch (command) {
                case "quit":
                    System.out.println("Cheers");
                    break label; // Exits the loop and quits the program
                case "add": {
                    System.out.print("In Estonian: ");
                    String key = reader.nextLine();
                    System.out.print("In English: ");
                    String value = reader.nextLine();
                    dictionary.add(key, value);
                    break;
                }
                case "translate": {
                    System.out.print("Give a word: ");
                    String key = reader.nextLine();
                    System.out.print("Translation: ");
                    System.out.println(dictionary.translate(key));
                    break;
                }
                default:
                    System.out.println("Unknown statement");
                    break;
            }
        }
    }
}
