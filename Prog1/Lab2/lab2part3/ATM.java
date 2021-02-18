public class ATM
{
    public void go()
    {
        System.out.println("Welcome to online ATM banking");
        System.out.println("How much do you want in your account?");
        while(true)
        {
            this.mAmount = myToolbox.readIntegerFromCmd();
            System.out.println(-mAmount);
            if (this.mAmount >= 0)
            {
                choice();
                break;
            }
            System.out.println("\nPlease enter a valid amount");
            System.out.println("You can not have a negative starting balance");
        }
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
        else if (this.mChoice == 4)
            quit();
    }
    
    private void withdraw() {
        int a;

        a = 0;
        System.out.println(mStars);
        System.out.println("*               Withdrawal               *");
        System.out.println(mStars);
        while (true)
        {
            a = myToolbox.readIntegerFromCmd();
            if (a >= 0 && this.mAmount - a >= 0)
                break;
            System.out.println("Please enter a valid amount");
        }
        this.mAmount = this.mAmount - a;
        System.out.println(mStars);
        System.out.println(mNB + this.mAmount + "£     *");
        System.out.println(mStars);
        choice();
    }

    private void deposit()
    {
        int a;

        System.out.println(mStars);
        System.out.println("*                Deposit                 *");
        System.out.println(mStars);
        System.out.println("How much would you like to deposit?");
        while (true)
        {
            a = myToolbox.readIntegerFromCmd();
            if (a >= 0)
                break;
            System.out.println("Please enter a positive amount");
        }
        this.mAmount = this.mAmount + a;
        System.out.println(mStars);
        System.out.println(mNB + this.mAmount + "£     *");
        System.out.println(mStars);
        choice();
    }

    private void inquire()
    {
        System.out.println(mStars);
        System.out.println("*                Inquire                 *");
        System.out.println(mStars);
        System.out.println(mStars);
        System.out.println("*            Your balance is " + this.mAmount + "£     *");
        System.out.println(mStars);
        choice();
    }

    private void quit()
    {
        System.out.println(mStars);
        System.out.println("                 GoodBye!                 ");
        System.out.println(mStars);
        System.exit(0);
    }
    
    private int mChoice;
    private int mAmount;
    Toolbox myToolbox = new Toolbox();
    private String mStars = "******************************************";
    private String mNB = "*            Your new balance is ";
}