package CIE;

import java.util.Scanner;

public class Internals extends Student
{
    public int ciemarks[]=new int[5];
    public void getmarks()
    {
        getData();
        System.out.println("Enter the CIE marks of the Student: ");
        for(int i=0;i<5;i++)
        {
            System.out.printf("Subject "+(i+1)+" :");
            ciemarks[i]=ss.nextInt();
        }
    }
    public void display()
    {
        System.out.println("Name: "+this.name);
        System.out.println("USN: "+this.usn);
        System.out.println("Semester: "+this.sem);
    }
}
