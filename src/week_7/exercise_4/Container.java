package week_7;
import java.util.ArrayList;


public class Container {
        private final ArrayList<Suitcase>suitcases;
        private int totalweight;
        private final int weight_lim;
        Container(int weight_lim) {
            suitcases = new ArrayList<>();
            this.weight_lim = weight_lim;
        }
        public void addSuitcase(Suitcase suitcase) {
            if (totalweight+ suitcase.totalWeight()<=weight_lim) {
                suitcases.add(suitcase);
                totalweight += suitcase.totalWeight();
            }
        }
        public String toString() {
            if (suitcases.isEmpty()) {
                return "empty";
            }
            else if (suitcases.size()==1) {
                return suitcases.size() + " suitcase (" + totalweight + " kg)";
            }
            else {
                return suitcases.size() + " suitcases (" + totalweight + " kg)";
            }
        }
        public void printThings() {
            for (Suitcase suitcase : suitcases) {
                suitcase.printThings();
            }
        }
}
