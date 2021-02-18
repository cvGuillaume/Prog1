import java.util.*;

public class UserGroup
{
    public ArrayList<User> getUsers()
    {
        return (this.userL);
    }

    public void addSampleData()
    {
        int i;
        for (i = 0; i < 10; i++)
        {
            userL.add(userC);
        }
        System.out.print(userL);
    }

    public User getUser(int nbr)
    {
        return (userL.get(nbr));
    }

    public void printUsernames()
    {
        int i;

        for (i = 0; i < 10; i++)
        {
            System.out.println(userL.get(i).username + " " + userL.get(i).userType);
        }
    }

    public void removeFirstUser()
    {
        userL.remove(0);
    }

    public void removeLastUser()
    {
        userL.remove(userL.size() - 1);
    }

    public void removeUser(String user)
    {
        int i;

        for (i = 0; i < userL.size(); i++)
        {
            if (!userL.contains(user))
                userL.remove(i);
        }
    }
    ArrayList<User> userL = new ArrayList<>();
    User userC = new User("",   "", "");
}