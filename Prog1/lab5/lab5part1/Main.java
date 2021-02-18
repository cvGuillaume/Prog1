public class Main {
    public static void main(String[] args) {
        String test1 = "You can discover more about a person in an hour of play than in a year of conversation";
        String test2 = "When you play play hard when you work dont play at all";
        WordGroup w1 = new WordGroup(test1);
        WordGroup w2 = new WordGroup(test2);
        String[] res1 = w1.getWordArray();
        String[] res2 = w2.getWordArray();

        for (int i = 0; i < res1.length; i++)
            System.out.println(res1[i]);
        for (int i = 0; i < res2.length; i++)
            System.out.println(res2[i]);
    }
}
