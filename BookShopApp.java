import java.util.ArrayList;

public class BookShopApp
{
    public static void main(String[] args)
    {
        // create the stocklist as an ArrayList to store the books
        ArrayList<Book> stocklist = new ArrayList<>();

        Author [] authors1 = {new Author("Robert Nisbet", "", 'u')};
        Book book1 = new Book("Data Mining Handbook", authors1, 27.95, 10);
        stocklist.add(book1);

        Author [] authors2 = {new Author("Roger Hutty", "", 'u')};
        Book book2 = new Book("Mastering COBOL", authors2, 4.95, 10);
        stocklist.add(book2);
        
        Author [] authors3 = {new Author("Paul Murrill", "", 'u')};
        Book book3 = new Book("Intro to COBOL", authors3, 7.35, 4);
        stocklist.add(book3);
        
        Author [] authors4 = {new Author("Andy Oram", "", 'u')};
        Book book4 = new Book("Making Software", authors4, 35.00, 5);
        stocklist.add(book4);
        
        Author [] authors5 = {
            new Author("James Nino", "", 'u'),
            new Author("Frederick Hosch", "", 'u')
            };
        Book book5 = new Book("OO Design Using Java", authors5, 30.00 	, 6);
        stocklist.add(book5);
        
        Author [] authors6 = {
            new Author("David Barnes", "", 'u'),
            new Author("Michael Kolling", "", 'u')
            };
        Book book6 = new Book("Objects First with Java", authors6, 29.50, 4);
        stocklist.add(book6);

        for (Book b : stocklist) 
        {
            System.out.println(b);
        }
        for (Book b : stocklist) 
        {
            String name = b.getName();
            String authors = b.getAuthorNames();
            double price = b.getPrice();
            int qty = b.getQty();
            System.out.printf("| %-23s | %-28s | %6.2f | %03d |\n",name,authors,price,qty);
        }

        String searchFor = "making software";
        searchFor = searchFor.toLowerCase();
        System.out.println("Search for term(s) '" + searchFor + "' in title...");
        for (Book b : stocklist) 
        {
            if (b.getName().toLowerCase().equals(searchFor))
            {
                b.setQty(b.getQty()-1);
            }
        }
        for (Book b : stocklist) 
        {
            String name = b.getName();
            String authors = b.getAuthorNames();
            double price = b.getPrice();
            int qty = b.getQty();
            System.out.printf("| %-23s | %-28s | %6.2f | %03d |\n",name,authors,price,qty);
        }

        String removeAll = "cobol";
        System.out.println("Removing all books with term '" + removeAll + "' in title...");
        int removed = 0; 
        for (int i = 0; i<stocklist.size(); i++) 
        {
            Book b = stocklist.get(i);
            if (b.getName().toLowerCase().contains(removeAll))
            {
                stocklist.remove(i);
                i--;
                removed++;
            }
        }
        System.out.println("Removed "+removed+" books");
        for (Book b : stocklist) 
        {
            String name = b.getName();
            String authors = b.getAuthorNames();
            double price = b.getPrice();
            int qty = b.getQty();
            System.out.printf("| %-23s | %-28s | %6.2f | %03d |\n",name,authors,price,qty);
        }
    }
}