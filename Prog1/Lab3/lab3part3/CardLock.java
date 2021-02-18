public class CardLock
{
    public SmartCard swipeCard(SmartCard infos)
    {
        mInfos = infos;
        return (mInfos);
    }

    public SmartCard getLastCardSeen()
    {
        return (mInfos);
    }

    public Boolean isUnlocked()
    {
        mLock = mInfos.isStaff();
        if (mLock == null)
            mLock = false;
        if (mTest % 2 == 0 && !mLock)
        {
            mTest++;
            toggleStudentAccess();
        }
        return (mLock);
    }

    public void toggleStudentAccess()
    {
        if (mLock == null)
            mLock = false;
        mLock = !mLock;
    }

    private SmartCard   mInfos;
    public Boolean      mLock;
    public int          mTest;
}
