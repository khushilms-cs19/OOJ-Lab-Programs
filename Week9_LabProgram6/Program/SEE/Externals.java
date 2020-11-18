package SEE;

import java.util.Scanner;


public class Externals extends CIE.Student
{
    public int seemarks[]=new int[5];
    Scanner ss=new Scanner(System.in);
    public void getmarks()
    {
        System.out.println("Enter the SEE marks of the Student: ");
        for(int i=0;i<5;i++)
        {
            System.out.printf("Subject "+(i+1)+" :");
            seemarks[i]=ss.nextInt();
        }
    }
}
