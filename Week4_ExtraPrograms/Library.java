import java.util.Scanner;
class Book
{
    String bookid,booktitle,author,publisher;
    double price;
    int no_of_pages,year_of_pub;

    Scanner ss=new Scanner(System.in);

    Book()
    {
        bookid="123456";
        booktitle="Harry Potter";
        no_of_pages=500;
        year_of_pub=1997;
        author="J K Rowling";
        publisher="Bloomsbury";
        price=1200;
    }

    Book(String bid,String btitle,int nop,int yop,String auth,String pub,double pri)
    {
        bookid=bid;
        booktitle=btitle;
        no_of_pages=nop;
        year_of_pub=yop;
        author=auth;
        publisher=pub;
        price=pri;
    }


    void getDetails()
    {
        System.out.println("\nEnter the Book Details: ");
        System.out.println("\nTitle: ");
        booktitle=ss.next();
        System.out.println("ID: ");
        bookid=ss.next();
        System.out.println("Number of pages: ");
        no_of_pages=ss.nextInt();
        System.out.println("Year of publish: ");
        year_of_pub=ss.nextInt();
        System.out.println("Author: ");
        author=ss.next();
        System.out.println("Publisher: ");
        publisher=ss.next();
    }
    
    void printDetails()
    {
        System.out.println("\nThe player details are: ");
        System.out.println("\nBook Title: "+booktitle);
        System.out.println("\nID: "+bookid);
        System.out.println("\nNumber of pages: "+no_of_pages);
        System.out.println("\nYear of Publish: "+year_of_pub);
        System.out.println("\nAuthor: "+author);
        System.out.println("\nPublisher: "+publisher);
        System.out.println("\nPrice: "+price);
    }
    
    String getAuthor()
    {
        return this.author;
    }
}

class Library{
    public static void main(String args[])
    {
        Scanner ss=new Scanner(System.in);
       Book b1=new Book();
       Book b2=new Book("67890","OutBreak",450,2020,"Robin Cook","McGrawHill",1500);
       b1.printDetails();
       b2.printDetails();
       System.out.println("Enter the author name: ");
       String auth=ss.next();
       if(b1.getAuthor()==auth)
       {
           System.out.println("The book is: ");
           b1.printDetails();
       }
       else if(b2.getAuthor()==auth)
       {
           System.out.println("The book is: ");
           b2.printDetails();
       }
       else 
           System.out.println("There is no book name with the author "+auth);

        if(b1.price>b2.price)
            System.out.println("The most expensive book is: "+b1.booktitle);
        else
            System.out.println("The most expensive book is: "+b2.booktitle);

        if(b1.no_of_pages<b2.no_of_pages)
            System.out.println("The book with the least number of pages: "+b1.booktitle);
        else
            System.out.println("The book with the least number of pages: "+b2.booktitle);
    }
}

