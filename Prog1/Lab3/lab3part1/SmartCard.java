public class SmartCard
{
    public SmartCard(String name)
    {
        this.mName = name;
    }
    
    public void setStaff(Boolean bool)
    {
        if (bool == null)
            this.mBool = false;
        else
            this.mBool = true;
    }
    
    public String getOwner()
    {
        // int i;

        // i = 0;
        // if (mName.substring(0, 3) == "Dr.")
        //     i += 4;
        // while (mName.charAt(i) != 32)
        //     i++;
        // return (mName.substring(0, i));
        return (mName);
    }

    public Boolean isStaff()
    {
        if (mBool == null)
            return false;
        else
            return true;
    }
    private String mName;
    private Boolean mBool;
}