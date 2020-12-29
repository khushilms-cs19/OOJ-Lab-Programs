import java.util.Scanner;

class Player
{
    String name;
    private String id;
    private double scores[],avg;
    private int no_matches_played;

    Scanner ss=new Scanner(System.in);

    Player()
    {
        name="Mahendra Singh Dhoni";
        id="123abc456";
        scores=new double[]{23,45,43,14};
        no_matches_played=4;
    }

    Player(String nam,String ID,double score[],int nmp)
    {
        name=nam;
        id=ID;
        scores=score;
        no_matches_played=nmp;
    }


    void getDetails()
    {
        System.out.println("\nEnter the Player Details: ");
        System.out.println("\nName: ");
        name=ss.next();
        System.out.println("ID: ");
        id=ss.next();
        System.out.println("Number of matches played: ");
        no_matches_played=ss.nextInt();
        scores=new double[no_matches_played];
        System.out.println("Enter the score of the matches played: ");
        for(int i=0;i<no_matches_played;i++)
        {
            System.out.println("Enter the score of match"+(i+1)+" :");
            scores[i]=ss.nextInt();
        }
    }
    
    void printDetails()
    {
        System.out.println("\nThe player details are: ");
        System.out.println("\nName: "+name);
        System.out.println("\nID: "+id);
        for(int i=0;i<no_matches_played;i++)
        {
            System.out.println("The Player Scored "+scores[i]+" in Match "+(i+1));
        }    
    }
    
    void avg_score()
    {
        double sum=0;
        for(int i=0;i<no_matches_played;i++)
            sum+=scores[i];
        avg=sum/no_matches_played;
        System.out.println("The average score is: "+avg);
    }
    double getavg()
    {
        return avg;
    }

}

class Player_Details{
    public static void main(String args[])
    {
        Player p1=new Player();
        p1.printDetails();
        p1.getDetails();
        p1.printDetails();
        double runs[]={56.0,78.0,97.0,23.0,41.0,45.0};
        Player p2=new Player("Virat Kohli","123ABC456",runs,6);
        p2.printDetails();  
        p2.avg_score();     
        
        if(p1.getavg()>p2.getavg())
            System.out.println("The Player with highest average is: "+p1.name);
        else 
            System.out.println("The player with highest average is: "+p2.name);    
    }
}

