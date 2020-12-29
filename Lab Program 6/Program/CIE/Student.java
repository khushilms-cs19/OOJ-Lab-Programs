package CIE;

import java.util.Scanner;

public class Student
{
    public String usn,name;
    public int sem;

    public Scanner ss=new Scanner(System.in);
    public void getData()
    {
        System.out.println("Name: ");
        name=ss.next();
        System.out.println("USN: ");
        usn=ss.next();
        System.out.println("Semester: ");
        sem=ss.nextInt();
    }
}
