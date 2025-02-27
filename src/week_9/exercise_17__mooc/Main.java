package week_9.exercise_17__mooc;

import week_9.exercise_17__mooc.logic.ApplicationLogic;
import week_9.exercise_17__mooc.ui.TextUserInterface;
import week_9.exercise_17__mooc.ui.UserInterface;

public class Main {
    public static void main(String[] args) {
        UserInterface ui = new TextUserInterface();
        new ApplicationLogic(ui).execute(3);
    }
}
