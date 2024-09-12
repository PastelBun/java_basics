package week_7;

import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private Dictionary[] dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader=reader;
        this.dictionary= new Dictionary[]{dictionary};
    }
    public void start(){

    }
}
