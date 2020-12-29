import java.util.Scanner;

class Age
{
    private byte years,months;
    private String name;

    Scanner ss=new Scanner(System.in);

    void getDetails()
    {
        System.out.println("Enter the name: ");
        name=ss.next();
        System.out.println("Enter the Age:");
        System.out.println("Years: ");
        years=ss.nextByte();
        System.out.println("Months: ");
        months=ss.nextByte();
    }

    double getAge()
    {
        return(years+(months/12));
    }

    public String toString()
    {
        return("Name: "+name+"\nThe Age is\nYears: "+years+"\nMonths: "+months);
    }
}

class AgeMain
{
    public static void main(String argsp[])
    {
        Age b1=new Age();
        b1.getDetails();
        Age b2=new Age();
        b2.getDetails();
        System.out.println(b1);
        System.out.println(b2);
        System.out.println("The Eldest person amoung the two is:");
        if(b1.getAge()>b2.getAge())
            System.out.println(b1);
        else
            System.out.println(b2);    
    }
}