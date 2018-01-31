
/**
 * Creates a book object
 * @author Sean Stock
 * @version 1.30.18
 */
public class Book
{
    private String firstName;
    private String lastName;
    private String isbn;
    private String title;
    private String date;
    private int numPages;
    private static final int MIN_PAGES = 10;

    /**
     * Constructor for objects of class Book
     */
    public Book(String firstName, String lastName, String isbn, String title, String date, int numPages)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isbn = isbn;
        this.title = title;
        this.date = date;
        this.numPages = numPages;
    }

    /**
     * Prompts User for first name
     * @param  firstName
     */
    public void promptFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    /**
     * Prompts User for last name
     * @param  lastName
     */
    public void promptLastName(String lastName)
    {
        this.lastName = lastName;
    }
    
    /**
     * Prompts User for ISBN
     * @param  ISBNNumber
     */
    public void promptISBN(String isbn)
    {
        this.isbn = isbn;
    }
    
    /**
     * Prompts User for book title
     * @param  bookTitle
     */
    public void promptTitle(String title)
    {
        this.title = title;
    }
    
    /**
     * Prompts User for date of publication
     * @param  pubDate
     */
    public void promptDate(String date)
    {
        this.date = date;
    }
    
    /**
     * Prompts User for number of pages
     * @param  pages
     */
    public void promptNumPages(int numPages)
    {
        if(numPages >= MIN_PAGES) {
            this.numPages = numPages;
        } 
        else {
        System.out.println("Please enter a number greater than 9");
        } 
    }
    
    /**
     * Return author first name
     */
    public String getFirstName()
    {
        return firstName;
    }
    
     /**
     * Return author last name
     */
    public String getLastName()
    {
        return lastName;
    }
    
     /**
     * Return ISBN
     */
    public String getISBN()
    {
        return isbn;
    }
    
     /**
     * Return title
     */
    public String getTitle()
    {
        return title;
    }
    
     /**
     * Return date
     */
    public String getDate()
    {
        return date;
    }
    
     /**
     * Return number of pages
     */
    public int getNumPages()
    {
        return numPages;
    }
}
