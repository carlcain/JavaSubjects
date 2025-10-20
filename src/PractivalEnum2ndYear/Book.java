public class Book
{
    private String bookID;
    private String title;
    private Category category;
    private static int bookCount;

    public void setBookID(String bookID)
    {
        this.bookID = bookID;
        System.out.println("-- set bookID "+bookID);
    }

    public void setTitle(String title)
    {   
        this.title = title;
        System.out.println("-- set book title "+title);
    }

    public void setCategory(Category category)
    {
        this.category = category;
        System.out.println("-- set book cathegory "+Category.values());
    }

    public String getBookID()
    {
        System.out.println("-- get bookID "+bookID);
        return bookID;
    }

    public String getTitle()
    {
        System.out.println("-- get book title "+title);
        return title;
    }

    public int getbookCount()
    {
        System.out.println("-- get category title "+Category.values());
        return bookCount;
    }

    public void addbook()
    {
        bookCount++;
        System.out.println("-- get bookCount "+bookCount);
    }
}
