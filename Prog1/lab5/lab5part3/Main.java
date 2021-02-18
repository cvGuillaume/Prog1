import java.util.*;

public class Main {
    public static void main(String[] args) {
        String platoString = "You can discover more about a person in an hour of play than in a year of conversation";
        String roosString = "When you play play hard when you work dont play at all";

        WordGroup plato = new WordGroup(platoString);
        WordGroup roos = new WordGroup(roosString);

        HashMap<String, Integer> platoHash = new HashMap<>();
        HashMap<String, Integer> roosHash = new HashMap<>();

        platoHash = plato.getWordCounts();
        roosHash = roos.getWordCounts();
        
        for (String key : platoHash.keySet()) {
			System.out.println(key + ": " + platoHash.get(key));
        }
		for (String key : roosHash.keySet()) {
			System.out.println(key + ": " + roosHash.get(key));
		}
    }
}