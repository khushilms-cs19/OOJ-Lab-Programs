import java.util.Scanner;

class Employee
{
    private String empid;
    private String empname;
    private int empnohrs,extrahours;
    private double empbasic,emphra,empda,empit,empgross;

    Scanner ss=new Scanner(System.in);

    void getDetails()
    {
        System.out.println("Enter the Employee Details:");
        System.out.println("ID:");
        empid=ss.next();
        System.out.println("Name:");
        empname=ss.next();
        System.out.println("Basic Pay:");
        empbasic=ss.nextDouble();
        System.out.println("Health Allowance in %:");
        emphra=ss.nextDouble();
        System.out.println("Dental Allowance in %:");
        empda=ss.nextDouble();
        System.out.println("Income Tax in %:");
        empit=ss.nextDouble();
        System.out.println("Number of working hours: ");
        empnohrs=ss.nextInt();
    }

    void grosspay()
    {
        empgross=empbasic+empbasic*(emphra/100)+empbasic*(empda/100)-empbasic*(empit/100);
        System.out.println("The Gross Pay is :"+empgross);
        extrawork();
    }
    private void extrawork()
    {
        if(empnohrs>200)
        {
            extrahours=empnohrs-200;
            empgross+=100*extrahours;
            System.out.println("Extra Hours: "+extrahours);
            System.out.println("The Gross Pay After Extra Hours: "+empgross);
        }
        else if(empnohrs<200)
        {
            extrahours=200-empnohrs;
            empgross-=100*extrahours;
            System.out.println("Numbers of hours worked less: "+extrahours);
            System.out.println("The Gross Pay after detucting: "+empgross);
        }

    }
}

class EmployeeMain
{
    public static void main(String args[])
    {
        Employee e1=new Employee();
        e1.getDetails();
        e1.grosspay();
    }
}