public class Main
{
    public static void main(String[] args)
    {
        Toolbox tool = new Toolbox();
        int nbr = tool.readIntegerFromCmd();
        int i = 1;
        int test = 0;
        for (i = 1; i <= 20; i++)
            System.out.println(nbr * i);
        i = 0;
        while (test < 500)
        {
            test += i;
            i++;
        }
        System.out.println(i - 1);
    }
}