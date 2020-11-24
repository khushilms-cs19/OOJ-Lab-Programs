import java.util.*;

class AgeException extends Exception
{
    public String toString()
    {
        return "Age of the Father Cannot be lesser than the age of the Son";
    }
}
class Father
{
    public Scanner ss=new Scanner(System.in);
    int f_age;
    Father()
    {
        System.out.println("Enter the Age of the Father: ");
        f_age=ss.nextInt();
    }
}

class Son extends Father
{
    int s_age;
    Son()
    {
        System.out.println("Enter the Age of the Son: ");
        s_age=ss.nextInt();
    }
}

class FamilyMain
{
    static void WrongAge(int fage, int sage) throws AgeException
    {
        if(fage < sage)
        {
            throw new AgeException();
        }
        System.out.println("There were no other problems arised during execution");
        System.out.println("The age of the Father is: "+fage);
        System.out.println("The age of the Son is: "+sage);
    }

    public static void main (String args[])
    {
        Son sn= new Son();
        try 
        {
            WrongAge(sn.f_age,sn.s_age);
        }
        catch(AgeException e)
        {
            System.out.println("An Exception popped up: "+ e);
        }
    }
}

