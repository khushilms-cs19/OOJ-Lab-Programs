import java.util.Scanner;

class Actor
{
    private String id,name;
    private int no_of_movies,no_years_of_exp;
    public double avg_exp;

    Scanner ss=new Scanner(System.in);

    void Accept()
    {
        System.out.println("Enter the Details of the Actor: ");
        System.out.println("ID: ");id=ss.next();
        System.out.println("Name: ");name=ss.next();
        System.out.println("Number of Movies: ");no_of_movies=ss.nextInt();
        System.out.println("Number of years of Experience: ");no_years_of_exp=ss.nextInt();
        this.calc_avg_exp();
    }

    void calc_avg_exp()
    {
        avg_exp=no_of_movies/no_years_of_exp;
    }

    public double getExp()
    {return avg_exp;}

    public String toString()
    {
        return ("The Actor Details are:\nID: "+id+"\nName: "+name+"\nNumber of Movies: "+no_of_movies+"\nNumber of Years of Experience: "+no_years_of_exp+"\nAverage Experience: "+avg_exp+" number of movies per year.");
    }
}

class ActorMain
{
    public static void main(String args[])
    {
        Scanner ss=new Scanner(System.in);
        int n,ind=0;
        double max=0;
        System.out.println("Enter the number of Actors: ");
        n=ss.nextInt();
        Actor ac[]=new Actor[n];
        for(int i=0;i<n;i++)
        {
            ac[i]=new Actor();
            ac[i].Accept();

        }    
        for(int i=0;i<n;i++)
        {
            if(max<ac[i].getExp())
            {
                max=ac[i].getExp();
                ind=i;
            }
        }
        System.out.println("The actor with max experience: ");
        System.out.println(ac[ind]);    
        
    }
}