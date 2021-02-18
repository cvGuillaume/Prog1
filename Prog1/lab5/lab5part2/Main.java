import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String platoString = "You can discover more about a person in an hour of play than in a year of conversation";
        
        WordGroup plato = new WordGroup(platoString);
        
        HashSet<String> allWords = new HashSet<>();

        allWords = plato.getWordSet(plato);
        System.out.println(allWords);
    }
}