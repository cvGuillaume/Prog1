public class ATM
{
    public void go()
    {
        System.out.println("Welcome to online ATM banking");
        System.out.println("How much do you want in your account?");
        this.mAmount = myToolbox.readIntegerFromCmd();
        System.out.println(this.mAmount);
        choice();
    }

    private void choice()
    {
        System.out.println("What do you want?");
        System.out.print("1 : Withdraw\n2 : Deposit\n3 : Inquire\n4 : Quit\n");
        this.mChoice = myToolbox.readIntegerFromCmd();
        if (this.mChoice == 1)
            withdraw();
        else if (this.mChoice == 2)
            deposit();
        else if (this.mChoice == 3)
            inquire();
        else
            {
                System.out.println(mStars);
                System.out.println("                 GoodBye!                 ");
                System.out.println(mStars);
                System.exit(0);
            }
    }

    private void withdraw()
    {
        int a;

        a = 0;
        System.out.println(mStars);
        System.out.println("*               Withdrawal               *");
        System.out.println(mStars);
        while (true)
        {
            System.out.println("How much would you like to withdraw?");
            a = myToolbox.readIntegerFromCmd();
            if (mAmount - a >= 0)
                break;
            System.out.println("\nPlease enter a valid amount");
            System.out.println("You cannot withdraw more than the amount in your bank account\n");
        }
        this.mAmount = this.mAmount - a;
        System.out.println(mStars);
        System.out.println(mNB + this.mAmount + "£     *");
        System.out.println(mStars);

    }

    private void deposit()
    {
        int a;

        System.out.println(mStars);
        System.out.println("*                Deposit                 *");
        System.out.println(mStars);
        System.out.println("How much would you like to deposit?");
        a = myToolbox.readIntegerFromCmd();
        this.mAmount = this.mAmount + a;
        System.out.println(mStars);
        System.out.println(mNB + this.mAmount + "£     *");
        System.out.println(mStars);
    }

    private void inquire()
    {
        System.out.println(mStars);
        System.out.println("*                Inquire                 *");
        System.out.println(mStars);
        System.out.println(mStars);
        System.out.println("*            Your balance is " + this.mAmount + "£     *");
        System.out.println(mStars);
    }

    private int mChoice;
    private int mAmount;
    Toolbox myToolbox = new Toolbox();
    private String mStars = "******************************************";
    private String mNB = "*            Your new balance is ";
}