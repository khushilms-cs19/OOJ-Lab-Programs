import java.util.Scanner;

class Book
{
    private String name,author;
    private double price;
    private int num_pages;

    Scanner ss=new Scanner(System.in);

    Book()
    {
        name="Harry Potter";
        author="J.K Rowling";
        price=1200.99;
        num_pages=550;
    }

    Book(String nam,String auth,double cost,int np)
    {
        name=nam;
        author=auth;
        price=cost;
        num_pages=np;
    }


    public void getDetails()
    {
        System.out.println("\nEnter the Book Details: ");
        System.out.println("Name: ");
        name=ss.next();
        System.out.println("Author: ");
        author=ss.next();
        System.out.println("Price: ");
        price=ss.nextDouble();
        System.out.println("Number of pages: ");
        num_pages=ss.nextInt();
        
    }
    
    public String toString()
    {
        return ("\n\nThe Book Details are:\n"+"Book Title: "+name+"\nAuthor: "+author+"\nPrice: "+price+"\nNumber of Pages: "+num_pages);
    }
}

class Book_Details{
    public static void main(String args[])
    {
        Scanner xx=new Scanner(System.in);
        int n,ch;
        System.out.println("Enter the number of Books: ");
        n=xx.nextInt();
        Book b[]=new Book[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("1:Enter Values\n2:Print Default Values");
            System.out.println("\nEnter the choice: ");
            ch=xx.nextInt();
            if(ch==1)
            {
                b[i]=new Book();
                b[i].getDetails();
                System.out.println(b[i]);
            }
            else
            {
                b[i]=new Book();
                System.out.println(b[i]);
            }
        }
    }
}

