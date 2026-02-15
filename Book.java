public class Book
{
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    // constructors 
    public Book(String n, Author[] as, double p)
    {
        name = n;
        authors = as;
        price = p;
    }

    public Book(String n, Author[] as, double p, int quantity)
    {
        name = n;
        authors = as;
        price = p;
        qty = quantity;
    }

    // methods
    public String toString()
    {
        String authorsString = "";
        for (int i = 0; i<authors.length; i++)
        {
            authorsString+=authors[i].toString()+",";
        }
        authorsString = authorsString.substring(0,authorsString.length()-1);
        return String.format("Book[name=%s,authors={%s},price=%.2f,qty=%d]",name,authorsString,price,qty);
    }

    public String getAuthorNames()
    {
        String result = "";
        for (int i = 0; i<authors.length; i++)
        {
            result+=authors[i].getName()+",";
        }
        return result.substring(0,result.length()-1);
    }

    // getters
    public String getName()
    {
        return name;
    }

    public Author[] getAuthors()
    {
        return authors;
    }

    public double getPrice()
    {
        return price;
    }

    public int getQty()
    {
        return qty;
    }

    // setters
    public void setPrice(double p)
    {
        price = p;
    }

    public void setQty(int quantity)
    {
        qty = quantity;
    }
}