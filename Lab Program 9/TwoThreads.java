class NewThreads1 implements Runnable 
{
    Thread t;
    String name;
    long time;
    NewThreads1(String thname,long thtime)
    {
        time=thtime;
        name=thname;
        t=new Thread(this, name);
        t.start();
    }
    public void run()
    {
        try 
        {
            for(int n=10; n>0;n--)
            {
                System.out.println(t.getName());
                Thread.sleep(time);
            }
        }
        catch(InterruptedException ie)
        {
            System.out.println("Child Thread Interrupted");
        }
        System.out.println("Child Thread Quitting.....");
    }
}

class Thread_Main
{
    public static void main(String args[])
    {
        NewThreads1 n1=new NewThreads1("BMS College of Engineering.",10000);
        NewThreads1 n2=new NewThreads1("CSE",2000);
    }
}