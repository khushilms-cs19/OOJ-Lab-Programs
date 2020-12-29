import java.util.Scanner;

class StringCalc
{
    private String str;
    private int vow_count,con_count,spa_count;
    private char ch;

    Scanner ss= new Scanner(System.in);

    void Accept()
    {
        System.out.println("Enter the String: ");
        str=ss.nextLine();
        calculate();
    }

    void calculate()
    {
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='o' || ch=='u' || ch=='i')
                vow_count++;   
            else if(ch==' ')
                spa_count++;
            else  
                con_count++;  
        }
    }

    void display()
    {
        System.out.println("The number of vowels are: "+vow_count);
        System.out.println("The number of consonants are: "+con_count);
        System.out.println("The number of Spaces are: "+spa_count);
    }
}

class StringMain
{
    public static void main(String args[])
    {
        StringCalc c1= new StringCalc();
        c1.Accept();
        c1.display();
    }
}