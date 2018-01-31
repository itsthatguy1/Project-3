
/**
 * Creates books and displays information about them
 *
 * @author Sean Stock
 * @version 1.30.18
 */
public class Template
{
    Book book;
    /**
     * Constructor for objects of Search
     */
    public Template()
    {
    }

    /**
     * Creates a new book object
     * @param firstName, lastName, isbn, title, date, numPages
     */
    public void createBook(String firstName, String lastName, String isbn, String title, String date, int numPages)
    {
        book = new Book(firstName, lastName, isbn, title, date, numPages);
    }
    
    /**
     * Mutates an author's first name
     */
    public void changeFirstName(String firstName)
    {
        book.promptFirstName(firstName);
    }    
    
    /**
     * Mutates an author's last name
     */
    public void changeLastName(String lastName)
    {
        book.promptLastName(lastName);
    }
    
    /**
     * Mutates a book's ISBN number
     */
    public void changeISBN(String isbn)
    {
        book.promptISBN(isbn);
    }
    
     /**
     * Mutates a book's date of publish
     */
    public void changeDate(String date)
    {
        book.promptDate(date);
    }
    
    /**
     * Mutates a book's title
     */
    public void changeTitle(String title)
    {
        book.promptTitle(title);
    }
    
    /**
     * Mutates the number of pages a book has
     */
    public void changeNumPage(int numPages)
    {
        book.promptNumPages(numPages);
    }
    
    /**
     * Prints a book's author's first name
     */
    public String displayFirstName()
    {
        return book.getFirstName();
    }
    
    /**
     * Prints a book's autor's last name
     */
    public String displayLastName()
    {
        return book.getLastName();
    }
    
     /**
     * Prints a book's ISBN
     */
    public String displayISBN()
    {
        return book.getISBN();
    }
    
     /**
     * Prints a book's title
     */
    public String displayTitle()
    {
        return book.getTitle();
    }
    
     /**
     * Prints a book's date
     */
    public String displayDate()
    {
        return book.getDate();
    }
    
    /**
     * Prints number of pages a book has
     */
    public int displayNumPages()
    {
        return book.getNumPages();
    }
}
