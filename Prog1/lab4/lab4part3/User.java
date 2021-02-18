public class User
{

    User(String u, String t, String n)
    {
        username = u;
        userType = t;
        name = n;   
    }

    public String getUsername()
    {
        return (this.username);
    }

    public String getUserType()
    {
        return (this.userType);
    }

    public String getName()
    {
        return (this.name);
    }

    public void setUserType(String type)
    {
        this.userType = type;
    }

    public String username;
    public String userType;
    public String name;
    // Toolbox tool = new Toolbox();
}