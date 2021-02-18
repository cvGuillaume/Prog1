import java.util.ArrayList;

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

    ArrayList<User> userL = new ArrayList<>();
    User userC = new User("",   "", "");
}