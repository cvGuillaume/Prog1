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
    
    HashMap<String, Integer> getWordCounts()
    {
		HashMap<String, Integer> hMap = new HashMap<>();
		String[] arrayW = getWordArray();
		
        for (int i=0; i<arrayW.length; i++)
        {
			if (hMap.containsKey(arrayW[i]))
				hMap.put(arrayW[i], hMap.get(arrayW[i]) + 1); 
			else
				hMap.put(arrayW[i], 1);
		}
		
		return hMap;
	}

    private String words;
}