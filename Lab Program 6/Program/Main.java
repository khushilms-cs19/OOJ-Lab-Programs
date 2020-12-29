import java.util.Scanner; 
import CIE.*;
import SEE.*;

class Main 
{
    public static void main(String args[])
    {
        Scanner ss=new Scanner(System.in);
        int n;
        int finalmarks[][]=new int[5][5];
        System.out.println("Enter the number of Students: ");
        n=ss.nextInt();
        Internals studcie[]=new Internals[n];
        Externals studsee[]=new Externals[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("\n*******************************************************************************\n");
            studcie[i]=new Internals();
            studsee[i]=new Externals();
            studcie[i].getmarks();
            studsee[i].getmarks();
            for(int j=0;j<5;j++)
            {
                finalmarks[i][j]=studcie[i].ciemarks[j]+(studsee[i].seemarks[j]/2);
            }
        }
        System.out.println("\n*******************************************************************************\n");
        System.out.println("The Students and their finals marks are: \n");
        for(int i=0;i<n;i++)
        {
            studcie[i].display();
            for(int j=0;j<5;j++)
            {
                System.out.println("Subject "+(j+1)+" :"+finalmarks[i][j]);
            }
            System.out.println("\n*******************************************************************************\n");

        }
    }
}