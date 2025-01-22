package week_7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    HashMap<String, String> translated;

    public Dictionary() {
        this.translated=new HashMap<>();
    }
    public String translate(String word) {
        return this.translated.getOrDefault(word, "null");
    }
    public void add(String word, String translation) {
        this.translated.put(word, translation);
    }
    public int amountOfWords() {
        return this.translated.size();
    }
    public ArrayList<String> translationList() {
        ArrayList<String> list = new ArrayList<>();

        // Iterate over the HashMap and format "word = translation"
        for (Map.Entry<String, String> entry : this.translated.entrySet()) {
            String formattedEntry = entry.getKey() + " = " + entry.getValue();
            list.add(formattedEntry);
        }
        return list;
    }
}
