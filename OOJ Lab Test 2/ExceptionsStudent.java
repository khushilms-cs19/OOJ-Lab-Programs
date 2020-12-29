import java.util.Scanner; 
class noargs extends Exception
{
    public String toString()
    {
        return "There are no arguments given.";
    }
}
class negmarks extends Exception
{
    public String toString()
    {
        return "The marks cannot be negative";
    }
}
class StudentMain 
{
    static void NoargsIn(String args[]) throws noargs
    {
        if(args.length==0)
        {
            throw new noargs();
        }
        for(int i=0;i<10;i++)
        {
            if(args[i]==null)
            {
                throw new noargs();
            }
        }
    }
    static void NegMarksE(int marks[]) throws negmarks
    {
        for(int i=0;i<3;i++)
        {
            if(marks[i]<0)
            {
                throw new negmarks();
            }
        }
    }
    public static void main(String args[])
    {
        try{
            String name1,name2,usn1,usn2;
            int marks1[]=new int[3];
            int marks2[]=new int[3];
            NoargsIn(args);
            usn1=args[0];
            name1=args[1];
            for(int i=0;i<3;i++)
            {
                marks1[i]=Integer.parseInt(args[i+2]);
            }
            NegMarksE(marks1);
            usn2=args[5];
            name2=args[6];
            for(int i=0;i<3;i++)
            {
                marks2[i]=Integer.parseInt(args[i+7]);
            }    

            NegMarksE(marks2);
            System.out.println("The Details of student 1:");
            System.out.println(name1);
            System.out.println(usn1);
            for(int i=0;i<3;i++)
            {
                System.out.println(marks1[i]);
            }
            System.out.println("The Details of student 2:");
            System.out.println(name2);
            System.out.println(usn2);
            for(int i=0;i<3;i++)
            {
                System.out.println(marks2[i]);
            }
            System.out.println("the program executed without errors.");
        }
        catch(noargs na)
        {
            System.out.println(na);
        }
        catch(negmarks nm)
        {
            System.out.println(nm);
        }
        catch(ArrayIndexOutOfBoundsException aib)
        {
            System.out.println("There are no enough arguments given in the commandline");
        }
        

    }
}