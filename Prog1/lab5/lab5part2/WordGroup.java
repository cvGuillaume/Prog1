import java.util.*;

class WordGroup
{
    WordGroup(String str)
    {
        words = str.toLowerCase();
    }

    public String[] getWordArray()
    {
        return (words.split(" "));
    }

    HashSet<String> getWordSet(WordGroup param)
    {
		
		HashSet<String> hash = new HashSet<>();
		
		String[] arrayThis = this.getWordArray();
		String[] paramWords = param.getWordArray();
		
		for (int i = 0; i < arrayThis.length; i++)
			hash.add(arrayThis[i]);
		
		for (int j = 0; j < paramWords.length; j++)
			hash.add(paramWords[j]);
		
		return (hash);
    }
    private String words;
}
