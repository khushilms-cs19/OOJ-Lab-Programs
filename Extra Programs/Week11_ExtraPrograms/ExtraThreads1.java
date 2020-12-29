class ThreadsNew implements Runnable
{
    String name;
    Thread t;
    int sumodd=0,i;
    ThreadsNew(String ThName)
    {
        name=ThName;
        t=new Thread(this,name);
        t.start();
    }
    public void run()
    {
        try
        {
            for(i=1;i<=100;i++,i++)
            {
                sumodd+=i;
            }
            System.out.println("The sum of all odd numbers between 1 to 100 is: "+sumodd);
        }
        catch(Exception ie)
        {
            System.out.println("The Child Thread Experienced an Exception.");
        }
    }
}


class ThreadMain3
{
    public static void main(String args[])
    {
        new ThreadsNew("Odd Sum");
        int sumeven=0;
        System.out.println("The Main Thread has Started.");
        try{
            for(int i=2;i<=100;i++,i++)
            {
                sumeven+=i;
            }
            System.out.println("The Sum of all even numbers between 1 to 100 is: "+sumeven);
        }
        catch(Exception e)
        {
            System.out.println("The Main Thread Experienced an Exception.");
        }
    }
}