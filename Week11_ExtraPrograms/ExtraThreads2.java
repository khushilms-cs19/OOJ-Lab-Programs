import java.util.Random;
class ThreadsRandom implements Runnable
{
    String name;
    int type;
    int result;
    Thread t;
    Random ran=new Random();
    static int num;
    ThreadsRandom(String thname,int typeth)
    {
        name=thname;
        type=typeth;
        t=new Thread(this,name);
        t.start();
    }

    public void run()
    {
        try{
            if(type==1)
            {
                for(int i=0;i<10;i++)
                {
                    num=ran.nextInt(100);
                    System.out.println("The Random number is: "+num);
                    Thread.sleep(1000);
                }
            }
            else if(type==2)
            {
                for(int i=0;i<10;i++)
                {
                    if(num%2==0)
                    {
                        int sq;
                        sq=num*num;
                        System.out.println("The Square of the number is: "+sq);
                    }
                    Thread.sleep(1100);
                }
            }
            else 
            {
                for(int i=0;i<10;i++)
                {
                    if(num%2==1)
                    {
                        int cube;
                        cube=num*num*num;
                        System.out.println("The Cube of the number is: "+cube);
                    }    
                    Thread.sleep(1100);
                }
            }
        }
        catch(InterruptedException ie)
        {
            System.out.println("The Thread "+type+" experienced an Interrupt.");
        }
    }
}

class RandomThreadMain
{
    public static void main(String args[])
    {
        new ThreadsRandom("one",1);
        new ThreadsRandom("two",2);
        new ThreadsRandom("three",3);
    }
}