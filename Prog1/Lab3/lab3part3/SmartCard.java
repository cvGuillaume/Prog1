public class SmartCard
{
    public SmartCard(String name)
    {
        this.mName = name;
    }
    
    public void setStaff(Boolean bool)
    {
        this.mBool = bool;
    }
    
    public String getOwner()
    {
        int i;

        i = mName.length() - 1;
        while (mName.charAt(i) != 32)
            i--;
        return (mName.substring(0, i));
    }

    public Boolean isStaff()
    {
        return (mBool);
    }
    public String mName;
    public Boolean mBool;
}
