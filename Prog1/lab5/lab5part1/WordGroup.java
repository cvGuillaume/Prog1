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
    public String words;
}