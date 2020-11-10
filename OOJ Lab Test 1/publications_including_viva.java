import java.util.Scanner; 

class publication
{
    String title;
    Double price;
}

class book extends publication
{
    int page_count;
    Scanner ss=new Scanner(System.in);

    void getdata()
    {
        System.out.println("Enter the book details: ");
        System.out.println("Title: ");
        title=ss.next();
        System.out.println("Price: ");
        price=ss.nextDouble();
        System.out.println("Page Count: ");
        page_count=ss.nextInt();
    }

    void putdata()
    {
        System.out.println("The book Details are: ");
        System.out.println("Title: "+title);
        System.out.println("Price: "+price);
        System.out.println("Page Count: "+page_count);
    }
    
    int getpagecount()
    {
        return page_count;
    }
   //Object passing as parameter to a method (for viva)
   book getdetails(book b1)
   {
       System.out.println("\nThis is inside the method returning object of class book");
       b1.title="BreakTime";
       b1.price=500.0;
       b1.page_count=330;
       return b1;
   }
}


class tape extends publication
{
    int playing_time;
    
    Scanner ss=new Scanner(System.in);

    void getdata()
    {
        System.out.println("Enter the Cassette details: ");
        System.out.println("Title: ");
        title=ss.next();
        System.out.println("Price: ");
        price=ss.nextDouble();
        System.out.println("Playing time in minutes: ");
        playing_time=ss.nextInt();
    }

    void putdata()
    {
        System.out.println("The Cassette Details are: ");
        System.out.println("Title: "+title);
        System.out.println("Price: "+price);
        System.out.println("Playing time in minutes: "+playing_time);
    }

    int getplaytime()
    {
        return playing_time;
    }

    void gettitle()
    {
        System.out.println("Title: "+title);
    }

}

class publicationsmain
{
    public static void main(String args[])
    {
        int i,m,n,count=0;
        int playing_time;
        Scanner ss=new Scanner(System.in);

        System.out.println("Enter the number of books: ");
        m=ss.nextInt();
        System.out.println("Enter the number of Cassettes: ");
        n=ss.nextInt();
        book b[]=new book[m];
        tape t[]=new tape[n];

        for(i=0;i<m;i++)
        {
            b[i]=new book();
            b[i].getdata();
        }

        for(i=0;i<n;i++)
        {
            t[i]=new tape();
            t[i].getdata();
        }

        System.out.println("The books with the number of pages greater than 500 :");
        for(i=0;i<m;i++)
        {
            if(b[i].getpagecount()>500)
            {
                b[i].putdata();
                count++;
            }
        }

        System.out.println("The no. of books with pages greater than 500: "+count);

        System.out.println("Enter the playing time: ");
        playing_time=ss.nextInt();

        System.out.println("The Cassettes with Playing time lesser than "+playing_time+" minutes is: ");
        for(i=0;i<n;i++)
        {
            if(t[i].getplaytime()<playing_time)
            {
                t[i].gettitle();
            }
        }

        book b2=new book();
        book b3=new book();

        b3=b2.getdetails(b2);
        b3.putdata();
    }
}