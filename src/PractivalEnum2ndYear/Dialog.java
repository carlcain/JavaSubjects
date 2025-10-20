package PractivalEnum2ndYear;

import java.util.Scanner;

public class Dialog 
{
    private Scanner sc = new Scanner(System.in);
    private Book book = new Book();

    public Dialog()
    {
        try
        {
            System.out.print("Enter number of books to be created: ");
            int num = sc.nextInt();

            System.out.println();

             for(int i = 0; i < num; i++)
             {
                System.out.print("Enter BookID: ");
                book.setBookID(sc.next());

                System.out.print("Enter Book Title: ");
                book.setTitle(sc.next());

                System.out.print("Enter Book Cathgeory: ");
                Category cat = setPacticularCategory(sc.next());
                book.setCategory(cat);

                book.addbook();
             }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println();
            System.out.println("Total number of books created: "+book.getbookCount());
        }
    }

    public Category setPacticularCategory(String cat) throws InvalidCategoryException
    {
        String upperCat = cat.toUpperCase();

        if(upperCat.equals("FICTION"))
        {
            return Category.FICTION;
        }
        else if(upperCat.equals( "NON_FICTION"))
        {
            return Category.NON_FICTION;
        }
        else if(upperCat.equals( "SCIENCE"))
        {
            return Category.SCIENCE;
        }
        else if(upperCat.equals( "HISTORY"))
        {
            return Category.HISTORY;
        }
        else
        {
            throw new InvalidCategoryException("Exception: The Cathegory is invalid");
        }
    }
}
