import java.util.Scanner; 

class PLAYER
{
    String name;
    int matches_played;
    double average;

    Scanner ss=new Scanner(System.in);

    void getDetails()
    {
        System.out.println("Enter the Player details: ");
        System.out.println("Name: ");
        name=ss.next();
        System.out.println("Matched Played: ");
        matches_played=ss.nextInt();
    }

    double cal_average(String nam,int runs, int matches)
    {
        average=(runs)/matches;
        System.out.println("The average runs of "+nam+" is: "+average);
        return average;
    }

    void printdetails()
    {
        System.out.println("The Player Details are:");
        System.out.println("Name: "+name);
        System.out.println("Matches Played: "+matches_played);
        System.out.println("Average: "+average);
    }
}

class BATSMAN extends PLAYER
{
    int runs_scored;
    double result;

    void getruns()
    {
        getDetails();
        System.out.println("Enter the runs Scored : ");
        runs_scored=ss.nextInt();
        result=cal_average(name, runs_scored, matches_played);
    }   
}

class BOWLER extends PLAYER
{
    int runs_given;
    double result;

    void getruns()
    {
        getDetails();
        System.out.println("Enter the runs given : ");
        runs_given=ss.nextInt();
        result=cal_average(name, runs_given, matches_played);
    }
}

class PlayerMain
{
    public static void main(String args[])
    {
        Scanner ss=new Scanner(System.in);

        int n,m;
        System.out.println("Enter the number of batsman and bowlers: ");
        n=ss.nextInt();
        m=ss.nextInt();
        BATSMAN bt[]=new BATSMAN[n];
        System.out.println("Enter the Details of the Batsmen: ");
        for(int i=0;i<n;i++)
        {
            bt[i]=new BATSMAN();
            bt[i].getruns();
        }
        System.out.println("Enter the Details of the Bowlers: ");
        BOWLER bw[]=new BOWLER[m];
        for(int i=0;i<m;i++)
        {
            bw[i]=new BOWLER();
            bw[i].getruns();
        }
        System.out.println("\n\nThe Details of the Batsman are: \n");
        for(int i=0;i<n;i++)
            bt[i].printdetails();
        System.out.println("\n\nThe Details of the Bowlers are: \n");    
        for(int i=0;i<m;i++)
            bw[i].printdetails();    
    }
}