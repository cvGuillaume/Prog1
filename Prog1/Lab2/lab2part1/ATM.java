public class ATM
{
    public void go()
    {
        System.out.println("Welcome to online ATM banking");
        System.out.println("How much do you want in your account?");
        this.mAmount = myToolbox.readIntegerFromCmd();
        System.out.println(this.mAmount);
    }
    private int mAmount;
    Toolbox myToolbox = new Toolbox();
}