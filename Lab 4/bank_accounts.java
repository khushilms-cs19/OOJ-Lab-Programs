import java.util.Scanner;
import java.lang.Math;

class Account
{
    Scanner ss=new Scanner(System.in);
    String acc_name;
    String acc_no;
    int acc_type;
    double balance;

    void CreateAccount()
    {
        System.out.println("Enter the Deals of the new account: ");
        System.out.printf("Name: ");
        acc_name=ss.next();
        System.out.printf("Ideal Account number: ");
        acc_no=ss.next();
        if(acc_type==1)
        {
            System.out.printf("Enter the first Deposite Value: ");
            balance=ss.nextDouble();
            System.out.println("Thank you for creating an Account.");
        }
        else
        {
            System.out.println("Enter the first Deposite Value(above 5000): ");
            balance=ss.nextDouble();
            System.out.println("Thank you for creating an Account.\nYou will shortly receive your Cheque Book.");
        }
    }

    String getAccountNo()
    {
        return acc_no;
    }

    void Display()
    {
        System.out.println("The Account Details are given as follows: ");
        System.out.println("Name: "+acc_name);
        System.out.println("Account Number: "+acc_no);
        if(acc_type==1)
            System.out.println("Account Type: Savings Account");
        else
            System.out.println("Account Type: Current Account");
        System.out.println("Balance: "+balance);        
    }
}

class Sav_Acct extends Account
{
    void withdraw()
    {
        double amount;
        System.out.println("Enter the Amount to be withdrawn: ");
        amount=ss.nextDouble();
        balance-=amount;
    }

    void deposite()
    {
        double amount;
        System.out.println("Enter the Amount to be Deposited: ");
        amount=ss.nextDouble();
        balance+=amount;
    }
    void compound_interest()
    {
        byte years_of_dep;
        double interest;
        System.out.println("Enter the number of years for compound interest: ");
        years_of_dep=ss.nextByte();
        interest=(balance*Math.pow(1+(4.5/100),years_of_dep))-balance;
        System.out.println("The Compound interest is: "+interest);
        
    }
}


class Curr_Acct extends Account
{
    void withdraw()
    {
        double amount;
        System.out.println("Warning: A minimum of 5000 balance must be maintained\n\tIf failed, a penalty of Rs.100 will be imposed.");
        System.out.println("Enter the Amount to be withdrawn: ");
        amount=ss.nextDouble();
        balance-=amount;
        penaltycheck();
    }

    void deposite()
    {
        double amount;
        System.out.println("Enter the Amount to be Deposited: ");
        amount=ss.nextDouble();
        balance+=amount;
    }

    void penaltycheck()
    {
        if(balance<5000)
        {
            int pen=100;
            System.out.println("The balance is less than 5000 a penalty of Rs.100 is imposed.");
            balance-=pen;
        }
    }
}


class Bank
{
    public static void main(String args[])
    {
        Sav_Acct S_acct[]=new Sav_Acct[10];
        Curr_Acct C_acct[]=new Curr_Acct[10];
        Scanner ss=new Scanner(System.in);
        String acctno;
        int ch,i=0,j=0;
        while(true)
        {
        System.out.println("Welcome to the bank.\n");
        System.out.println("Enter the action to be performed:");
        System.out.println("1: Create a Savings Account\n2: Create a Current Account");
        System.out.println("3: Deposite \n4: Withdraw\n5:Display Balance\n6: Check Compound Interest");
        System.out.printf("Enter your choice: ");
        ch=ss.nextInt();
        switch(ch)
        {
            case 1: S_acct[i]=new Sav_Acct();
                    S_acct[i].acc_type=1;
                    S_acct[i].CreateAccount();
                    i++;
                    break;

            case 2: C_acct[j]=new Curr_Acct();
                    C_acct[j].acc_type=2;
                    C_acct[j].CreateAccount();
                    j++;
                    break;

            case 3: System.out.println("Enter the account number: ");
                    acctno=ss.next();
                    for(int k=0;k<j;k++)
                    {
                        if(acctno.equals(C_acct[k].getAccountNo()))
                        {
                            System.out.println("This Account is a Current Account.");
                            C_acct[k].deposite();
                        }
                    }
                    for(int k=0;k<i;k++)
                    {
                        if(acctno.equals(S_acct[k].getAccountNo()))
                        {
                            System.out.println("This Account is a Savings Account.");
                            S_acct[k].deposite();
                        }
                    }
                    break;

            case 4: System.out.println("Enter the account number: ");
            acctno=ss.next();
            for(int k=0;k<j;k++)
            {
                if(acctno.equals(C_acct[k].getAccountNo()))
                {
                    System.out.println("This Account is a Current Account.");
                    C_acct[k].withdraw();
                }
            }
            for(int k=0;k<i;k++)
            {
                if(acctno.equals(S_acct[k].getAccountNo()))
                {
                    System.out.println("This Account is a Savings Account.");
                    S_acct[k].withdraw();
                }
            }
            break;
            
            case 5: System.out.println("Enter the account number: ");
                    acctno=ss.next();
                    for(int k=0;k<j;k++)
                    {
                        if(acctno.equals(C_acct[k].getAccountNo()))
                            C_acct[k].Display();
                    }
                    for(int k=0;k<i;k++)
                    {
                        if(acctno.equals(S_acct[k].getAccountNo()))
                            S_acct[k].Display();
                    }
                    break;
            case 6: System.out.println("Enter the account number: ");
                    acctno=ss.next();
                    for(int k=0;k<j;k++)
                    {
                        if(acctno.equals(C_acct[k].getAccountNo()))
                            System.out.println("This is a Current account .\nThis account does not provide interest.");
                    }
                    for(int k=0;k<i;k++)
                    {
                        if(acctno.equals(S_acct[k].getAccountNo()))
                            S_acct[k].compound_interest();
                    }
                    break;        
        }
    }    
    }
}