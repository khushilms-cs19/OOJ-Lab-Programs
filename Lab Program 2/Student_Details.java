import java.util.Scanner;

class Student
{
    private String USN;
    private String name;
    private int credits[]=new int[5];
    private double marks[]=new double[5];
    private double total_gp=0,sgpa;
    private int total_credits=0;
    private int gp=0;
    
    Scanner ss=new Scanner(System.in);

    void getDetails()
    {
        System.out.println("Enter the Student Details:");
        System.out.println("\nUSN:");
        USN=ss.next();
        System.out.println("\nName:");
        name=ss.next();
        for(int i=0;i<5;i++)
        {
            System.out.printf("\nMarks and Credits of Subject %d :",i+1);
            marks[i]=ss.nextDouble();
            credits[i]=ss.nextInt();
        }
    }
    void printDetails()
    {
        System.out.printf("\nThe Student Details are:");
        System.out.printf("\nUSN: %s",USN);
        System.out.printf("\nName: %s",name);
        for(int i=0;i<5;i++)
        {
            System.out.printf("\nSubject %d Marks: %.2f",i+1,marks[i]);
            System.out.printf("\nSubject %d Credits: %d",i+1,credits[i]);    
        }
    }
    void getSGPA()
    {
        for(int i=0;i<5;i++)
        {
            total_credits+=credits[i];
            if(marks[i]==100.0)
                gp=(int)marks[i]/10;
            else    
                gp=(int)((marks[i]/10)+1);
            total_gp+=gp*credits[i];
        }
        sgpa=total_gp/total_credits;
        System.out.printf("\nThe SGPA of the student is: %.2f",sgpa);
    }
}
public class Student_Details{

    public static void main(String args[])
    {
        Student s1=new Student();
        s1.getDetails();
        s1.printDetails();
        s1.getSGPA();
    }
}
