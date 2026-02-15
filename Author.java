public class Author
{
    private String name;
    private String email;
    private char gender;

    public Author(String n, String e, char g)
    {
        name = n;
        email = e;
        gender = g;
    }

    public String getName()
    {
        return name;
    }

    public String getEmail()
    {
        return email;
    }

    public char getGender()
    {
        return gender;
    }

    public void setEmail(String e)
    {
        email = e;
    }

    public String toString()
    {
        return String.format("Author[name=%s,email=%s,gender=%c]",name,email,gender);
    }
}