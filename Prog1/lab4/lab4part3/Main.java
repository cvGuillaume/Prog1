public class Main
{
    public static void main(String[] args) {
        UserGroup tool = new UserGroup();
        tool.addSampleData();
        tool.printUsernames();
        UserGroup administrators = new UserGroup();
        administrators.getUserIterator();
    }
}